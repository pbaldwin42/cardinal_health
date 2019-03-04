package com.baldwin.patrick.java_audition.coin;

public interface CoinHelper {
    int NICKLE_WEIGHT = 5000;
    int NICKLE_DIAMETER = 21210; // 20,786 21,634
    int NICKLE_THICKNESS = 1950;

    int DIME_WEIGHT = 2268;
    int DIME_DIAMETER = 17910;
    int DIME_THICKNESS = 1350;

    int QUARTER_WEIGHT = 5670;
    int QUARTER_DIAMETER = 24660;
    int QUARTER_THICKNESS = 1750;

    // percentage of tolerance
    double TOLERANCES = 0.02;

    static boolean withinTolerance(int target, int referenceBase) {
        return (target >= referenceBase * (1 - TOLERANCES) &&
                target <= referenceBase * (1 + TOLERANCES));
    }
    static boolean isNickel(Coin target) {
        return (withinTolerance(target.getWeight(), NICKLE_WEIGHT) &&
                withinTolerance(target.getDiameter(), NICKLE_DIAMETER) &&
                withinTolerance(target.getThickness(), NICKLE_THICKNESS));
    }
    static boolean isDime(Coin target) {
        return (withinTolerance(target.getWeight(), DIME_WEIGHT) &&
                withinTolerance(target.getDiameter(), DIME_DIAMETER) &&
                withinTolerance(target.getThickness(), DIME_THICKNESS));
    }
    static boolean isQuarter(Coin target) {
        return (withinTolerance(target.getWeight(), QUARTER_WEIGHT) &&
                withinTolerance(target.getDiameter(), QUARTER_DIAMETER) &&
                withinTolerance(target.getThickness(), QUARTER_THICKNESS));
    }
}
