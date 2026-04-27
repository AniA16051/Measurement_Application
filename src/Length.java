package com.apps.MeasurementApp;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {
        // Step 1: Update Enum with Yards and Centimeters
        // Factors are relative to the base unit (INCHES)
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),         // 1 Yard = 3 Feet = 36 Inches
        CENTIMETERS(0.393701); // 1 Centimeter = 0.393701 Inches

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Step 2: Logic remains the same (Generic design scales effortlessly)
    private double convertToBaseUnit() {
        // Rounding to 2 decimal places to handle floating point precision in cm comparisons
        double converted = this.value * unit.getConversionFactor();
        return Math.round(converted * 100.0) / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(this.convertToBaseUnit(), that.convertToBaseUnit()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(convertToBaseUnit());
    }
}