package com.apps.MeasurementApp;

public class MeasurementApp {

    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }

    public static void demonstrateFeetEquality() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(1.0, Length.LengthUnit.FEET);
        System.out.println("1 Feet == 1 Feet: " + f1.equals(f2));
    }

    public static void demonstrateInchesEquality() {
        Length i1 = new Length(12.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("12 Inches == 12 Inches: " + i1.equals(i2));
    }

    public static void demonstrateFeetInchesComparison() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("1 Feet == 12 Inches: " + feet.equals(inches));
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}