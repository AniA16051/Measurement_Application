package com.apps.MeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeasurementAppTest {

    // --- UC3 Legacy Tests ---
    @Test
    public void testFeetInchesComparison() {
        assertEquals(new Length(1.0, Length.LengthUnit.FEET), new Length(12.0, Length.LengthUnit.INCHES));
    }

    // --- UC4 Extended Tests (Yards) ---
    @Test
    public void yardEquals36Inches() {
        assertEquals(new Length(1.0, Length.LengthUnit.YARDS), new Length(36.0, Length.LengthUnit.INCHES));
    }

    @Test
    public void threeFeetEqualsOneYard() {
        assertEquals(new Length(3.0, Length.LengthUnit.FEET), new Length(1.0, Length.LengthUnit.YARDS));
    }

    @Test
    public void yardNotEqualToInches() {
        assertNotEquals(new Length(1.0, Length.LengthUnit.YARDS), new Length(1.0, Length.LengthUnit.INCHES));
    }

    // --- UC4 Extended Tests (Centimeters) ---
    @Test
    public void centimeterEqualsInches() {
        // Based on 1cm = 0.393701in
        assertEquals(new Length(1.0, Length.LengthUnit.CENTIMETERS), new Length(0.39, Length.LengthUnit.INCHES));
    }

    @Test
    public void thirtyPointFourEightCmEqualsOneFoot() {
        // 1 foot = 30.48 cm
        assertEquals(new Length(30.48, Length.LengthUnit.CENTIMETERS), new Length(1.0, Length.LengthUnit.FEET));
    }

    @Test
    public void referenceEqualitySameObject() {
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(l1, l1);
    }

    @Test
    public void equalsReturnsFalseForNull() {
        assertNotEquals(null, new Length(1.0, Length.LengthUnit.CENTIMETERS));
    }
}