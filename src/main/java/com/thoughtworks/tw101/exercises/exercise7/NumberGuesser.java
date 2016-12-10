package com.thoughtworks.tw101.exercises.exercise7;


public class NumberGuesser {
    private int minNumber;
    private int maxNumber;

    public NumberGuesser(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public int randomNumber() {
        return (int) (Math.random() * maxNumber + minNumber);
    }
}
