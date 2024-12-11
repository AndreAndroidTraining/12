package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException {
        int singleFlips =5;
        int multiFlips = 10;
        Flipper flipper = new Flipper();
        PlayerDetails playerDetails = new PlayerDetails();

        HashMap playerDetails1 = playerDetails.getPlayerDetails();
        String username1 = playerDetails1.get("username").toString();

        System.out.println("Returned PlayerDetails: " + playerDetails1);

        //Test for Single flip method calls
        for (int i = 0; i < singleFlips; i++) {
            boolean b = flipper.singleFlipperReturn();
            boolean b1 = flipper.singleFlipperComplex();
            System.out.println("Single flip simple: "+b);
            System.out.println("Single flip complex: "+b1);
        }

        //Tests for Multiple flips
        boolean[] booleans = flipper.multipleFlipsReturn(multiFlips);
        boolean[] booleans1 = flipper.multipleFlipsComplex(multiFlips);

        for (int i = 0; i < multiFlips; i++) {
            System.out.println("Multiple flip simple: "+booleans[i]);
            System.out.println("Multiple flip simple: "+booleans1[i]);
        }

    }
}