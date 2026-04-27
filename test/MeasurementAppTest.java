package com.apps.MeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeasurementAppTest {

    // Existing UC4 Equality Tests
    @Test
    public void testFeetInchesEquality() {
        assertEquals(new Length(1.0, Length.LengthUnit.FEET), new Length(12.0, Length.LengthUnit.INCHES));
    }

    // --- UC5 Conversion Tests ---
    @Test
    public void convertFeetToInches() {
        Length converted = MeasurementApp.demonstrateLengthConversion(3.0, Length.LengthUnit.FEET, Length.LengthUnit.INCHES);
        Length expected = new Length(36.0, Length.LengthUnit.INCHES);
        assertTrue(MeasurementApp.demonstrateLengthEquality(converted, expected));
    }

    @Test
    public void convertYardsToInches() {
        Length converted = MeasurementApp.demonstrateLengthConversion(2.0, Length.LengthUnit.YARDS, Length.LengthUnit.INCHES);
        Length expected = new Length(72.0, Length.LengthUnit.INCHES);
        assertTrue(MeasurementApp.demonstrateLengthEquality(converted, expected));
    }

    @Test
    public void convertCmToInches() {
        // 1 cm = 0.393701 in
        Length converted = MeasurementApp.demonstrateLengthConversion(1.0, Length.LengthUnit.CENTIMETERS, Length.LengthUnit.INCHES);
        assertEquals(0.39, converted.convertTo(Length.LengthUnit.INCHES).equals(new Length(0.39, Length.LengthUnit.INCHES)) ? 0.39 : 0.0);
    }

    @Test
    public void testInvalidUnitConversion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Length(1.0, Length.LengthUnit.FEET).convertTo(null);
        });
    }
}