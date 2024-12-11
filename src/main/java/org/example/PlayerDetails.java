package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class PlayerDetails {

    public HashMap getPlayerDetails () throws FileNotFoundException {
        HashMap playerDetails = new HashMap();
        File file = new File("filename.txt");
        Scanner sc = new Scanner(file);
        String text = sc.nextLine();

        String username = text.substring(7, 12);
        //System.out.println("Username : " + username);

        String score = text.substring(text.lastIndexOf(" "),text.length());
        //System.out.println("Score : " + score);

        int lenght = text.length();

        String substring = text.substring(30, lenght);
        //System.out.println("Previous count: " + substring);

        playerDetails.put("username", username);
        playerDetails.put("score", score);


        sc.close();
        return playerDetails;
    }

}
