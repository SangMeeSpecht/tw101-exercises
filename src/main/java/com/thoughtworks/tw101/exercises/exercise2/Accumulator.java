package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int methodCallCounter = 0;

    public void increment() {
        methodCallCounter += 1;
    }

    public void total() {
        System.out.println(methodCallCounter);
    }
}
