package com.baldwin.patrick.java_audition.coin;

public abstract class Coin {
    protected int weight; // measured in milligrams
    protected int diameter; // measured in micrometers
    protected int thickness; // measured in micrometers

    public int getWeight() {
        return weight;
    }
    public int getDiameter() {
        return diameter;
    }
    public int getThickness() {
        return thickness;
    }

    // percentage of tolerance
    private static double TOLERANCES = 0.02;

    public static boolean withinTolerance(int target, int referenceBase) {
        return (target >= referenceBase * (1 - TOLERANCES) &&
                target <= referenceBase * (1 + TOLERANCES));
    }

    @Override
    public String toString() {
        String result;

        result = "weight:     " + weight + " milligrams\n";
        result += "diameter:  " + diameter + " micrometers\n";
        result += "thickness:  " + thickness + " micrometers";
        return result;
    }
}
