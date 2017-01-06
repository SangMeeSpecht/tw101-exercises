package com.thoughtworks.tw101.exercises.exercise8;


import java.util.ArrayList;

public class Game {
    private int minNum = 1;
    private int maxNum = 100;
    private Number number = new Number(minNum, maxNum);
    private String rawUserGuess;
    private int userGuess;
    private View view = new View();
    private ArrayList<Integer> userGuesses= new ArrayList();
    private boolean guessedCorrectly;

    public void run() {
        view.chooseNumberMessage(minNum, maxNum);

        while (guessedCorrectly != true) {
            rawUserGuess = view.getUserInput();

            try {
                userGuess = Integer.parseInt(rawUserGuess);
                addGuess(userGuess);
                evaluateGuess();
            }
            catch (NumberFormatException e) {
                view.incorrectInputTypeMessage(rawUserGuess);
            }
        }
        view.renderUserGuesses(userGuesses);
    }

    private void evaluateGuess() {
        if (number.tooLow(userGuess)) {
            view.tooLowMessage(userGuess);
        } else if (number.tooHigh(userGuess)) {
            view.tooHighMessage(userGuess);
        } else if (number.guessedCorrectly(userGuess)) {
            view.guessedCorrectlyMessage(userGuess);
            guessedCorrectly = true;
        }
    }

    private void addGuess(int userGuess) {
        userGuesses.add(userGuess);
    }

}
