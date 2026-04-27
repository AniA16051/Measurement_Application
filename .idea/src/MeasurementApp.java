package com.apps.MeasurementApp;

import java.util.Objects;

/**
 * QuantityMeasurementApp - UC1: Feet measurement equality
 * This class is responsible for checking the equality of two numerical values
 * measured in feet in the Quantity Measurement Application.
 */
public class MeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        /**
         * Override equals() method to compare two Feet objects based on their value
         */
        @Override
        public boolean equals(Object obj) {
            // 1. Reference Check
            if (this == obj) return true;

            // 2. Null Check
            if (obj == null) return false;

            // 3. Type Check
            if (getClass() != obj.getClass()) return false;

            // 4. Value Comparison
            Feet feet = (Feet) obj;
            return Double.compare(feet.value, value) == 0;
        }
    }

    // Main method to demonstrate Feet equality check
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        System.out.println("Feet Equality Check: " + f1.equals(f2));
    }
}