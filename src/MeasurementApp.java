package com.apps.MeasurementApp;

public class MeasurementApp {

    public static void demonstrateExtendedUnitSupport() {
        // Yard to Feet
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        System.out.println("1 Yard == 3 Feet: " + yard.equals(feet));

        // Yard to Inches
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        System.out.println("1 Yard == 36 Inches: " + yard.equals(inches));

        // Centimeters to Inches
        Length cm = new Length(100.0, Length.LengthUnit.CENTIMETERS);
        Length in = new Length(39.37, Length.LengthUnit.INCHES);
        System.out.println("100 cm == 39.37 Inches: " + cm.equals(in));
    }

    public static void main(String[] args) {
        demonstrateExtendedUnitSupport();
    }
}