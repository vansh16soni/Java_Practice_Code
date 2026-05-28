package com.vansh;

import java.io.*;
import java.util.Scanner;

public class fILE {
    public static void main(String[] args) {
        File myFile = new File("Java First File");
        try {
            FileWriter fileWriter = new FileWriter("Java First File");
            fileWriter.write("I created this file for my learning purpose and I will keep going on it");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       // File myFile = new File("Java First File");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
