package com.apps.MeasurementApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Specific imports for the inner classes
import com.apps.MeasurementApp.MeasurementApp.Feet;
import com.apps.MeasurementApp.MeasurementApp.Inches;

public class MeasurementAppTest {

    // --- FEET TEST CASES ---

    @Test
    public void testFeetEquality_SameValue() {
        assertEquals(new Feet(1.0), new Feet(1.0));
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        assertNotEquals(new Feet(1.0), new Feet(2.0));
    }

    @Test
    public void testFeetEquality_NullComparison() {
        assertNotEquals(null, new Feet(1.0));
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        assertNotEquals(new Feet(1.0), new Object());
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet feet = new Feet(1.0);
        assertEquals(feet, feet);
    }

    // --- INCHES TEST CASES (UC2) ---

    @Test
    public void testInchesEquality_SameValue() {
        assertEquals(new Inches(12.0), new Inches(12.0));
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        assertNotEquals(new Inches(12.0), new Inches(13.0));
    }

    @Test
    public void testInchesEquality_NullComparison() {
        assertNotEquals(null, new Inches(1.0));
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        assertNotEquals(new Inches(1.0), new Object());
    }

    @Test
    public void testInchesEquality_SameReference() {
        Inches inch = new Inches(1.0);
        assertEquals(inch, inch);
    }
}