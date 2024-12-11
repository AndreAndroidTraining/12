package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    String username = "Andre";
    int previousFlips;


    public static void main(String[] args) throws IOException {
        int j =5;
        Flipper flipper = new Flipper();
        PlayerDetails playerDetails = new PlayerDetails();

        HashMap playerDetails1 = playerDetails.getPlayerDetails();
        String username1 = playerDetails1.get("username").toString();

        System.out.println(username1);
        System.out.println("Returned PlayerDetails: " + playerDetails1);


        for (int i = 0; i < j; i++) {
            boolean b = flipper.singleFlipperReturn();
            //System.out.println("Single flip: "+b);
        }

        boolean[] booleans = flipper.multipleFlipsReturn(20);

        for (int i = 0; i < booleans.length; i++) {
            //System.out.println("Multiple flip: "+booleans[i]);
        }

    }


    public void multipleFlips(int numOfFlips) throws IOException {
        Random random = new Random();
        int counter = 10;
        int headsCounter = numOfFlips;

        for (int i = 0; i < counter; i++) {
            boolean value = random.nextBoolean();

            if (value) {
                System.out.println("HEADS!");
                headsCounter++;

            }else
                System.out.println("TAILS!");

        }

        System.out.println(headsCounter-numOfFlips +" Head(s) counts have been added to the total");

        new CreateFile();
        MyFileWriter writer = new MyFileWriter();
        writer.write("User : "+username+" Has a total of : " + headsCounter);

    }


    //The same as singleFlipperReturn but translation done in BE and written to DB same time
    //Can change return type to a String
    public void singleFlipper(int previousFlips) throws IOException {
        Random random = new Random();
        int counter = 10;
        int headsCounter = previousFlips;

        boolean value = random.nextBoolean();

        if (value) {
             System.out.println("HEADS!");
             headsCounter++;
        }else
             System.out.println("TAILS!");

        System.out.println(headsCounter-previousFlips +" Head(s) counts have been added to the total");

        new CreateFile();
        MyFileWriter writer = new MyFileWriter();
        writer.write("User : "+username+" Has a total of : " + headsCounter);

    }
}