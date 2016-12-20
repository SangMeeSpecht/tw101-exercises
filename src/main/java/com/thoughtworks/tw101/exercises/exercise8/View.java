package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;
import java.util.ArrayList;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void chooseNumberMessage(int startNumber, int endNumber) {
        System.out.printf("What number am I thinking of?  Guess a number between %d and %d%n", startNumber, endNumber);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void tooLowMessage(int number) {
        System.out.printf("%d is too low.%n", number);
    }

    public void tooHighMessage(int number) {
        System.out.printf("%d is too high.%n", number);
    }

    public void guessedCorrectlyMessage(int number) {
        System.out.printf("Well aren't you clever!  %d is the correct number!  You win!%n", number);
    }

    public void incorrectInputTypeMessage(String userGuess) {
        System.out.printf("'%s' is not a valid input.  Please enter an integer.%n", userGuess);
    }

    public void renderUserGuesses(ArrayList<Integer> guesses) {
        System.out.println("\nYour guesses:");

        for (Integer guess : guesses) {
            System.out.println(guess);
        }
    }
}
