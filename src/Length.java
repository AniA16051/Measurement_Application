package com.apps.MeasurementApp;
import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;


    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    // Step 2: Constructor
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Helper method to convert the current value to the base unit (Inches)
    private double convertToBaseUnit() {
        return this.value * unit.getConversionFactor();
    }

    // Main comparison logic
    public boolean compare(Length that) {
        if (that == null) return false;
        return Double.compare(this.convertToBaseUnit(), that.convertToBaseUnit()) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;

        // Use the common base unit (Inches) to determine equality
        return Double.compare(this.convertToBaseUnit(), that.convertToBaseUnit()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(convertToBaseUnit());
    }
}