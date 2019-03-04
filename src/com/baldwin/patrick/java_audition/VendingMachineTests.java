package com.baldwin.patrick.java_audition;

import com.baldwin.patrick.java_audition.coin.CoinHelper;
import com.baldwin.patrick.java_audition.coin.Nickel;

public interface VendingMachineTests {
    static void run() {
        System.out.println(new Nickel(CoinHelper.NICKLE_WEIGHT, 20785,
                CoinHelper.NICKLE_THICKNESS));
    }
}
