package com.baldwin.patrick.java_audition;

import com.baldwin.patrick.java_audition.coin.CoinHelper;
import com.baldwin.patrick.java_audition.coin.Dime;
import com.baldwin.patrick.java_audition.coin.Nickel;
import com.baldwin.patrick.java_audition.coin.Quarter;

public interface VendingMachineTests {
    static void run() {
        try {
            System.out.println(new Nickel(CoinHelper.NICKLE_WEIGHT, 20786,
                    CoinHelper.NICKLE_THICKNESS));
            System.out.println();
            Nickel nickelFail = new Nickel(CoinHelper.NICKLE_WEIGHT, 20785,
                CoinHelper.NICKLE_THICKNESS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("\n");
        }
        try {
            System.out.println(new Dime(2223, CoinHelper.DIME_DIAMETER,
                    CoinHelper.DIME_THICKNESS));
            System.out.println();
            Dime dimeFail = new Dime(2222, CoinHelper.DIME_DIAMETER,
                CoinHelper.DIME_THICKNESS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("\n");
        }
        try {
            System.out.println(new Quarter(CoinHelper.QUARTER_WEIGHT,
                    CoinHelper.QUARTER_DIAMETER,1785));
            System.out.println();
            Quarter quarterFail = new Quarter(CoinHelper.QUARTER_WEIGHT,
                    CoinHelper.QUARTER_DIAMETER, 1786);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
