package org.example;

import java.io.IOException;
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

    //The same as singleFlipperReturn but translation done in BE and written to DB same time
    //Can change return type to a String
    public boolean singleFlipperComplex() throws IOException {
        Random random = new Random();
        int headsCounter=0;
        boolean value = random.nextBoolean();

        if (value) {
            System.out.println("HEADS!");
            headsCounter++;
        }else
            System.out.println("TAILS!");

        new CreateFile();
        MyFileWriter writer = new MyFileWriter();
        writer.write("User :  Has a total of : " + headsCounter);

        return value;

    }



    public boolean[] multipleFlipsComplex(int numOfFlips) throws IOException {
        Random random = new Random();
        int headsCounter = numOfFlips;
        boolean[] array = new boolean[numOfFlips];

        for (int i = 0; i < numOfFlips; i++) {
            boolean value = random.nextBoolean();
            array[i] = value;

            if (value) {
                System.out.println("HEADS!");
                headsCounter++;

            }else
                System.out.println("TAILS!");

        }

        System.out.println(headsCounter-numOfFlips +" Head(s) counts have been added to the total");


        new CreateFile();
        MyFileWriter writer = new MyFileWriter();
        writer.write("User : Has a total of : " + headsCounter);
        return array;
    }

}
