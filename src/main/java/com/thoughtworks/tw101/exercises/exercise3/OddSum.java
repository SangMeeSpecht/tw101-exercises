package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    private int currentSum = 0;

    private boolean isOdd(int number) { return (number % 2 != 0); }

    public Integer of(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                currentSum += i;
            }
        }
        return currentSum;
    }
}
