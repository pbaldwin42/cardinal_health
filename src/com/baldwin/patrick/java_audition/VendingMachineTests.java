package com.baldwin.patrick.java_audition;

import com.baldwin.patrick.java_audition.coin.Dime;
import com.baldwin.patrick.java_audition.coin.Nickel;
import com.baldwin.patrick.java_audition.coin.Quarter;

public interface VendingMachineTests {
    static void run() {
        try {
            System.out.println(new Nickel(Nickel.NICKLE_WEIGHT, 20786,
                    Nickel.NICKLE_THICKNESS));
            System.out.println();
            Nickel nickelFail = new Nickel(Nickel.NICKLE_WEIGHT, 20785,
                Nickel.NICKLE_THICKNESS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("\n");
        }
        try {
            System.out.println(new Dime(2223, Dime.DIME_DIAMETER,
                    Dime.DIME_THICKNESS));
            System.out.println();
            Dime dimeFail = new Dime(2222, Dime.DIME_DIAMETER,
                Dime.DIME_THICKNESS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("\n");
        }
        try {
            System.out.println(new Quarter(Quarter.QUARTER_WEIGHT,
                    Quarter.QUARTER_DIAMETER,1785));
            System.out.println();
            Quarter quarterFail = new Quarter(Quarter.QUARTER_WEIGHT,
                    Quarter.QUARTER_DIAMETER, 1786);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
