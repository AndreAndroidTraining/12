package org.example;

import java.util.Random;

public class Flipper {

    public boolean singleFlipperReturn (){
        Random random = new Random();
        return random.nextBoolean();
    }

    //Returns a boolean list with a user defined number of flips
    public boolean[] multipleFlipsReturn(int numOfFlips){
        Random random = new Random();

        boolean[] flips = new boolean[numOfFlips];
        for (int i = 0; i < numOfFlips; i++) {
            flips[i] = random.nextBoolean();
        }
        System.out.println(flips);
        return flips;
    };
}
