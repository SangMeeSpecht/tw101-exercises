package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

//assumes user puts in valid inputs (i.e. integers)

public class GameController {
    private int minNum = 1;
    private int maxNum = 100;
    private Number number = new Number(minNum, maxNum);
    private Scanner scanner = new Scanner(System.in);
    private int userGuess;
    private User user = new User();

    public void run() {
        View.chooseNumberMessage(minNum, maxNum);

        while (true) {
            userGuess = Integer.parseInt(scanner.next());
            user.addGuess(userGuess);

            if (number.tooLow(userGuess)) {
                View.tooLowMessage(userGuess);
            } else if (number.tooHigh(userGuess)) {
                View.tooHighMessage(userGuess);
            } else if (number.guessedCorrectly(userGuess)) {
                View.guessedCorrectlyMessage(userGuess);
                break;
            }
        }

        View.renderUserGuesses(user.getGuesses());
    }
}
