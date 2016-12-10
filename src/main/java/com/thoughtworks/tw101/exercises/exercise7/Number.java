package com.thoughtworks.tw101.exercises.exercise7;


public class GameLogic {
    private int minNumber;
    private int maxNumber;
    private int randNum;

    public GameLogic(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        randNum = randomNumber();
    }

    public int getRandNum() {
        return randNum;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int randomNumber() {
        return (int) (Math.random() * maxNumber + minNumber);
    }

    public boolean tooLow(int guess) {
        return (guess < randNum);
    }

    public boolean tooHigh(int guess) {
        return (guess > randNum);
    }

    public boolean guessedCorrectly(int guess) {
        return (guess == randNum);
    }
}
