package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    String username = "Andre";
    int previousFlips;


    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("filename.txt");
        File file = new File("filename.txt");
        Scanner sc = new Scanner(file);
        String text = sc.nextLine();
        System.out.println("Text : "+text);

        int lenght = text.length();

        String substring = text.substring(30, lenght);
        System.out.println("Previous count: " + substring);

        fr.close();
        sc.close();
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

    //Returns a boolean value (Heads = true) for translation in FE
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