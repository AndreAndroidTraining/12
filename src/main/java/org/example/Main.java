package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String Username = "Andre";
        FileReader fr = new FileReader("filename.txt");
        File file = new File("filename.txt");
        Scanner sc = new Scanner(file);
        
        String text = sc.nextLine();

        System.out.println("Text : "+text);

        int lenght = text.length();

        String previousCount = text.substring(30, lenght);
        System.out.println("Previous count: " + previousCount);

        fr.close();
        sc.close();

        Random random = new Random();
        int counter = 10;
        int headsCounter = Integer.parseInt(previousCount);

        for (int i = 0; i < counter; i++) {
            boolean value = random.nextBoolean();

            if (value) {
                System.out.println("HEADS!");
                headsCounter++;

            }else
                System.out.println("TAILS!");

        }

        System.out.println(headsCounter-Integer.parseInt(previousCount) +" Head(s) counts have been added to the total");

        new CreateFile();
        MyFileWriter writer = new MyFileWriter();
        writer.write("User : "+Username+" Has a total of : " + headsCounter);

    }

    public void singleFlipper() throws IOException {
        String Username = "Andre";
        FileReader fr = new FileReader("filename.txt");
        File file = new File("filename.txt");
        Scanner sc = new Scanner(file);

        String text = sc.nextLine();

        System.out.println("Text : "+text);

        int lenght = text.length();

        String previousCount = text.substring(30, lenght);
        System.out.println("Previous count: " + previousCount);

        fr.close();
        sc.close();

        Random random = new Random();
        int counter = 10;
        int headsCounter = Integer.parseInt(previousCount);

        boolean value = random.nextBoolean();

        if (value) {
             System.out.println("HEADS!");
             headsCounter++;
        }else
             System.out.println("TAILS!");

        System.out.println(headsCounter-Integer.parseInt(previousCount) +" Head(s) counts have been added to the total");

        new CreateFile();
        MyFileWriter writer = new MyFileWriter();
        writer.write("User : "+Username+" Has a total of : " + headsCounter);

    }
}