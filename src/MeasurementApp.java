package com.apps.MeasurementApp;

/**
 * UC5 - QuantityMeasurementApp: Extended Unit Support with Conversion
 */
public class MeasurementApp {

    /**
     * UC5: Static method to demonstrate length conversion from one unit to another.
     */
    public static Length demonstrateLengthConversion(double value, Length.LengthUnit fromUnit, Length.LengthUnit toUnit) {
        Length sourceLength = new Length(value, fromUnit);
        return sourceLength.convertTo(toUnit);
    }

    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }

    public static void main(String[] args) {
        // Examples based on UC5 expected output
        System.out.println("1.0 FEET to INCHES: " + demonstrateLengthConversion(1.0, Length.LengthUnit.FEET, Length.LengthUnit.INCHES));
        System.out.println("3.0 YARDS to FEET: " + demonstrateLengthConversion(3.0, Length.LengthUnit.YARDS, Length.LengthUnit.FEET));
        System.out.println("36.0 INCHES to YARDS: " + demonstrateLengthConversion(36.0, Length.LengthUnit.INCHES, Length.LengthUnit.YARDS));
    }
}