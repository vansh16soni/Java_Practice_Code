package com.vansh;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int num;
    private int ran;
    private int count = 0;

     Game() {
        Random r = new Random();
        ran = r.nextInt(10) + 1;

    }

    public void userInput(Scanner sc) {
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

    public int isCorrect() {
        if (num < ran) {
            return -1;
        } else if (num > ran) {
            return 1;
        } else {
            return 0;
        }
    }

    public void incrementCounter() {
        count++;
    }

    public void displayCounter() {
        System.out.println("Number of attempts: " + count);
    }
}

public class GameQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game v = new Game();

        while (true) {
            v.userInput(sc);
            int result = v.isCorrect();

            v.incrementCounter();

            if (result == 0) {
                System.out.println("Congratulations! You guessed the correct number ");
                v.displayCounter();
                break;
            } else if (result == -1) {
                System.out.println("Your number is too small. Try again.");
            } else {
                System.out.println("Your number is too large. Try again.");
            }
        }


    }
}
