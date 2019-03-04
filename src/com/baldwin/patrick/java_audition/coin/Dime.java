package com.baldwin.patrick.java_audition.coin;

public class Dime extends Coin {
    public Dime() {
        this.weight = CoinHelper.DIME_WEIGHT;
        this.diameter = CoinHelper.DIME_DIAMETER;
        this.thickness = CoinHelper.DIME_THICKNESS;
    }
    public Dime(int weightInGrams, int diameterInMicrometers,
                  int thicknessInMicrometers) throws Exception {
        this.weight = weightInGrams;
        this.diameter = diameterInMicrometers;
        this.thickness = thicknessInMicrometers;
        if (!CoinHelper.isDime(this)) {
            throw new IllegalArgumentException("Dime generated outside of tolerances\n" + this);
        }
    }
}
