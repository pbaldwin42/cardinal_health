package com.baldwin.patrick.java_audition;

public interface VendingMachine {
    // the actual logic would go in here
    static void run() {
        System.out.println("ran");
        // infinite loop of operation
            // make sure there's at least one dime and two nickels or two dimes and one nickle in the machine
                // if not, display "EXACT CHANGE ONLY"
                // else, "INSERT COINS"
            // ask for coins and have them enter the value of the coins

                /*
                 * parse through number inputs and generate coins that actually get
                 * entered into the vending machine, because it's not like this is
                 * interfacing with another piece of software that's sending coins as messages
                 */

                // eject coins that aren't the right value
                // make a stash object that stores each coin type in its own queue
                    // make the stash update the total every time a coin is added/removed to/from a queue

                    /*
                     * note that enum was not used for coins because each coin is
                     * evaluated and then added to a queue of its own type; also,
                     * enum wasn't used because it can't store different values
                     * for weight and dimensions since all of the data in an enum
                     * is final. Yes, I could have made the machine just look at everything
                     * as a Coin and to store/track each Coin with an enumerated "type" field,
                     * but it adds another layer when calling the values on the enum through the Coin
                     */

                // update the screen with the value of the stash every time a valid coin is added
                // eject each invalid coin as it's inserted
                // if item is selected, check price and stash values
                    // display item price if stash is too small or display SOLD OUT if it doesn't have any inventory

                    /*
                     * coin ingestion could get super complicated, like if the machine doesn't have enough
                     * room for a certain coin type, or if you're trying to make sure you hold onto your
                     * smallest coins so you can make change as often as possible. The simple/indifferent
                     * solution is just ingest every coin that was inserted and then make change by dividing
                     * by 25 and spitting out that many quarters, subtracting that from the total, and then
                     * doing the same thing with the dimes and nickles
                     */

    }
}
