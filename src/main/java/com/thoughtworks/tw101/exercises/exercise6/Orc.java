package com.thoughtworks.tw101.exercises.exercise6;


public class Orc implements Monster{

    private String name;
    private int hp = 0;

    public Orc(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public void takeDamage(int amount) {
        hp -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.printf("%s has %dhp.%n", name, hp);
    }
}
