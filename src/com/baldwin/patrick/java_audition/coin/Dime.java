package com.baldwin.patrick.java_audition.coin;

public class Dime extends Coin {
    public static final int DIME_WEIGHT = 2268;
    public static final int DIME_DIAMETER = 17910;
    public static final int DIME_THICKNESS = 1350;
    public static final int VALUE = 10;

    public Dime() {
        this.weight = DIME_WEIGHT;
        this.diameter = DIME_DIAMETER;
        this.thickness = DIME_THICKNESS;
    }
    public Dime(int weightInGrams, int diameterInMicrometers,
                  int thicknessInMicrometers) throws Exception {
        this.weight = weightInGrams;
        this.diameter = diameterInMicrometers;
        this.thickness = thicknessInMicrometers;
        if (!isDime(this)) {
            throw new IllegalArgumentException("Dime generated outside of tolerances\n" + this);
        }
    }

    public static boolean isDime(Coin target) {
        return (Coin.withinTolerance(target.getWeight(), DIME_WEIGHT) &&
                Coin.withinTolerance(target.getDiameter(), DIME_DIAMETER) &&
                Coin.withinTolerance(target.getThickness(), DIME_THICKNESS));
    }
}
