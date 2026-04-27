
package com.apps.MeasurementApp;
import java.util.Objects;

/**
 * A generic class representing length in different units.
 * Enhanced for UC5 to include explicit conversion operations.
 */
public class Length {
    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

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

    /**
     * UC5: Explicitly converts this length instance to a target unit.
     * returns a new Length instance with the converted value.
     */
    public Length convertTo(LengthUnit targetUnit) {
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }
        // Convert current value to base unit (inches), then divide by target factor
        double valueInBase = this.value * this.unit.getConversionFactor();
        double convertedValue = valueInBase / targetUnit.getConversionFactor();

        // Rounding to two decimal places for precision handling
        double roundedValue = Math.round(convertedValue * 100.0) / 100.0;
        return new Length(roundedValue, targetUnit);
    }

    private double convertToBaseUnit() {
        double convertedValue = this.value * unit.getConversionFactor();
        return Math.round(convertedValue * 100.0) / 100.0;
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

    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }
}