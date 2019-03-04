package com.baldwin.patrick.java_audition.coin;

public class Quarter extends Coin {
    public static final int QUARTER_WEIGHT = 5670;
    public static final int QUARTER_DIAMETER = 24660;
    public static final int QUARTER_THICKNESS = 1750;
    public static final int VALUE = 25;

    public Quarter() {
        this.weight = QUARTER_WEIGHT;
        this.diameter = QUARTER_DIAMETER;
        this.thickness = QUARTER_THICKNESS;
    }
    public Quarter(int weightInGrams, int diameterInMicrometers,
                  int thicknessInMicrometers) throws Exception {
        this.weight = weightInGrams;
        this.diameter = diameterInMicrometers;
        this.thickness = thicknessInMicrometers;
        if (!isQuarter(this)) {
            throw new IllegalArgumentException("Quarter generated outside of tolerances\n" + this);
        }
    }

    public static boolean isQuarter(Coin target) {
        return (Coin.withinTolerance(target.getWeight(), QUARTER_WEIGHT) &&
                Coin.withinTolerance(target.getDiameter(), QUARTER_DIAMETER) &&
                Coin.withinTolerance(target.getThickness(), QUARTER_THICKNESS));
    }
}
