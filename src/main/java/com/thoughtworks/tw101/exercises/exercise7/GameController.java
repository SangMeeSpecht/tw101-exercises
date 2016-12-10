package com.thoughtworks.tw101.exercises.exercise7;


public class GameController {
    private View view = new View();
    private NumberGuesser numberGuesser = new NumberGuesser(1, 100);
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        view.chooseNumberMessage(1, 100);
        int randomNumber = numberGuesser.randomNumber();

        while (scanner.next != randomNumber) {

        }



    }
}
