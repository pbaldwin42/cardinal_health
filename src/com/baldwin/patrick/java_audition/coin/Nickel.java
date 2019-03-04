package com.baldwin.patrick.java_audition.coin;

public class Nickel extends Coin {
    public static final int NICKLE_WEIGHT = 5000;
    public static final int NICKLE_DIAMETER = 21210;
    public static final int NICKLE_THICKNESS = 1950;
    public static final int VALUE = 5;

    public Nickel() {
        this.weight = NICKLE_WEIGHT;
        this.diameter = NICKLE_DIAMETER;
        this.thickness = NICKLE_THICKNESS;
    }
    public Nickel(int weightInGrams, int diameterInMicrometers,
                  int thicknessInMicrometers) throws Exception {
        this.weight = weightInGrams;
        this.diameter = diameterInMicrometers;
        this.thickness = thicknessInMicrometers;
        if (!isNickel(this)) {
            throw new IllegalArgumentException("Nickle generated outside of tolerances\n" + this);
        }
    }

    public static boolean isNickel(Coin target) {
        return (Coin.withinTolerance(target.getWeight(), NICKLE_WEIGHT) &&
                Coin.withinTolerance(target.getDiameter(), NICKLE_DIAMETER) &&
                Coin.withinTolerance(target.getThickness(), NICKLE_THICKNESS));
    }
}
