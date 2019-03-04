package com.baldwin.patrick.java_audition.coin;

public class Quarter extends Coin {
    public Quarter() {
        this.weight = CoinHelper.QUARTER_WEIGHT;
        this.diameter = CoinHelper.QUARTER_DIAMETER;
        this.thickness = CoinHelper.QUARTER_THICKNESS;
    }
    public Quarter(int weightInGrams, int diameterInMicrometers,
                  int thicknessInMicrometers) {
        this.weight = weightInGrams;
        this.diameter = diameterInMicrometers;
        this.thickness = thicknessInMicrometers;
        if (!CoinHelper.isNickel(this)) {
            throw new Error("Quarter generated outside of tolerances\n" + this);
        }
    }
}
