package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class User {
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void addGuess(int guess) {
        guesses.add(guess);
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}
