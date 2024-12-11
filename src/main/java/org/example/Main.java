package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
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
            boolean b1 = flipper.singleFlipperComplex();
            System.out.println("Single flip simple: "+b);
            System.out.println("Single flip complex: "+b1);
        }

        boolean[] booleans = flipper.multipleFlipsReturn(5);
        boolean[] booleans1 = flipper.multipleFlipsComplex(5);

        for (int i = 0; i < booleans.length; i++) {
            System.out.println("Multiple flip simple: "+booleans[i]);
        }

        for (int i = 0; i < booleans1.length; i++) {
            System.out.println("Multiple flip simple: "+booleans[i]);
        }

    }



}