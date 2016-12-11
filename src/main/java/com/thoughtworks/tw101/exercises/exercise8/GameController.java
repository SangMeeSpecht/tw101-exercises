package com.thoughtworks.tw101.exercises.exercise8;


public class GameController {
    private int minNum = 1;
    private int maxNum = 100;
    private Number number = new Number(minNum, maxNum);
    private String rawUserGuess;
    private int userGuess;
    private View view = new View();
    private User user = new User();
    private boolean guessedCorrectly;

    public void run() {
        view.chooseNumberMessage(minNum, maxNum);

        while (guessedCorrectly != true) {
            rawUserGuess = view.getUserInput();

            try {
                userGuess = Integer.parseInt(rawUserGuess);
                user.addGuess(userGuess);
                evaluateGuess();
            }
            catch (NumberFormatException e) {
                view.incorrectInputTypeMessage(rawUserGuess);
            }
        }
        view.renderUserGuesses(user.getGuesses());
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
}
