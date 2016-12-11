package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;
import java.util.ArrayList;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void chooseNumberMessage(int startNumber, int endNumber) {
        System.out.println("What number am I thinking of?  Guess a number between " + startNumber + " and " + endNumber);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void tooLowMessage(int number) {
        System.out.println(number + " is too low.");
    }

    public void tooHighMessage(int number) {
        System.out.println(number + " is too high.");
    }

    public void guessedCorrectlyMessage(int number) {
        System.out.printf("Well aren't you clever!  " + number + " is the correct number!  You win!");
    }

    public void incorrectInputTypeMessage(String userGuess) {
        System.out.println("'" + userGuess + "' is not a valid input.  Please enter an integer.");
    }

    public void renderUserGuesses(ArrayList<Integer> guesses) {
        System.out.println("\nYour guesses:");

        for (Integer guess : guesses) {
            System.out.println(guess);
        }
    }
}
