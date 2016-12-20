package com.thoughtworks.tw101.exercises.exercise6;


public class Troll implements Monster {

    public String name;
    private int hp = 0;

    public Troll(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public void takeDamage(int amount) {
        hp -= amount / 2;
    }

    @Override
    public void reportStatus() {
        System.out.printf("%s has %dhp.%n", name, hp);
    }
}
