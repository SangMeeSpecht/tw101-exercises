package com.thoughtworks.tw101.exercises.exercise8;


public class Number {
    private int min;
    private int max;
    private int random;

    public Number(int min, int max) {
        this.min = min;
        this.max = max;
        random = pickRandomNumber();
    }

    private int pickRandomNumber() {
        return (int) (Math.random() * max + min);
    }

    public boolean tooLow(int guess) {
        return (guess < random);
    }

    public boolean tooHigh(int guess) {
        return (guess > random);
    }

    public boolean guessedCorrectly(int guess) {
        return (guess == random);
    }
}
