package com.baldwin.patrick.java_audition.coin;

public class Nickel extends Coin {
    public Nickel() {
        this.weight = CoinHelper.NICKLE_WEIGHT;
        this.diameter = CoinHelper.NICKLE_DIAMETER;
        this.thickness = CoinHelper.NICKLE_THICKNESS;
    }
    public Nickel(int weightInGrams, int diameterInMicrometers,
                  int thicknessInMicrometers) {
        this.weight = weightInGrams;
        this.diameter = diameterInMicrometers;
        this.thickness = thicknessInMicrometers;
        if (!CoinHelper.isNickel(this)) {
            throw new Error("Nickle generated outside of tolerances\n" + this);
        }
    }
}
