package com.apps.MeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeasurementAppTest {

    @Test
    public void testFeetEquality() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(f1, f2);
    }

    @Test
    public void testInchesEquality() {
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(1.0, Length.LengthUnit.INCHES);
        assertEquals(i1, i2);
    }

    @Test
    public void testFeetInchesComparison() {
        // UC3 Core Goal: Cross-unit equality
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);
        assertEquals(feet, inches);
    }

    @Test
    public void testFeetInequality() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testInchesInequality() {
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(2.0, Length.LengthUnit.INCHES);
        assertNotEquals(i1, i2);
    }

    @Test
    public void testCrossUnitInequality() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(1.0, Length.LengthUnit.INCHES);
        assertNotEquals(feet, inches);
    }
}