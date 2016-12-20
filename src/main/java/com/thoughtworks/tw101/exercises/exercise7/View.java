package com.thoughtworks.tw101.exercises.exercise7;


public class View {
    public static void chooseNumberMessage(int startNumber, int endNumber) {
        System.out.printf("What number am I thinking of?  Guess a number between %d and %d%n", startNumber, endNumber);
    }

    public static void tooLowMessage(int number) {
        System.out.printf("%d is too low.%n", number);
    }

    public static void tooHighMessage(int number) {
        System.out.printf("%d is too high.%n", number);
    }

    public static void guessedCorrectlyMessage(int number) {
        System.out.printf("Well aren't you clever!  %d is the correct number!  You win!%n", number);
    }

}
