package org.example;

import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class MyFileWriter {
    public static void main(String[] args) {

    }

    public void write(String textToWrite){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(textToWrite);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
