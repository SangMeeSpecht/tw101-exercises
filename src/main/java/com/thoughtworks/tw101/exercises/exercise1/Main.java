package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {

    private static boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    public static void main(String[] args) {
        int currentSum = 0;

        for (int i = 1; i <= 100; i++) {
            if (isOdd(i)) {
                currentSum += i;
                System.out.println(i);
                System.out.println("sum: " + currentSum);
            }
        }
    }
}