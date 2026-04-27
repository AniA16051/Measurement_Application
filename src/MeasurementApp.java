package com.apps.MeasurementApp;

import java.util.Objects;

/**
 * QuantityMeasurementApp - UC2: Inches measurement equality
 * This class handles equality checks for Feet and Inches separately.
 */
public class MeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Feet feet = (Feet) obj;
            return Double.compare(feet.value, value) == 0;
        }
    }

    // Inner class to represent Inches measurement
    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            // 1. Reference Check
            if (this == obj) return true;
            // 2. Null Check
            if (obj == null) return false;
            // 3. Type Check
            if (getClass() != obj.getClass()) return false;

            // 4. Value Comparison
            Inches inches = (Inches) obj;
            return Double.compare(inches.value, value) == 0;
        }
    }

    public static void demonstrateFeetEquality() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        System.out.println("Feet Equality: " + f1.equals(f2));
    }

    public static void demonstrateInchesEquality() {
        Inches i1 = new Inches(12.0);
        Inches i2 = new Inches(12.0);
        System.out.println("Inches Equality: " + i1.equals(i2));
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
    }
}