package com.thoughtworks.tw101.exercises.exercise8;


import java.util.ArrayList;

public class View {
    public static void chooseNumberMessage(int startNumber, int endNumber) {
        System.out.println("What number am I thinking of?  Guess a number between " + startNumber + " and " + endNumber);
    }

    public static void tooLowMessage(int number) {
        System.out.println(number + " is too low.");
    }

    public static void tooHighMessage(int number) {
        System.out.println(number + " is too high.");
    }

    public static void guessedCorrectlyMessage(int number) {
        System.out.printf("Well aren't you clever!  " + number + " is the correct number!  You win!");
    }

    public static void renderUserGuesses(ArrayList<Integer> guesses) {
        System.out.println("\nYour guesses:");

        for (Integer guess : guesses) {
            System.out.println(guess);
        }
    }

}
