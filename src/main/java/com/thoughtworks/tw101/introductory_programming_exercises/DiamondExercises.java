package com.thoughtworks.tw101.introductory_programming_exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class DiamondExercises {
    public static void main(String[] args) {
        System.out.println("\nDRAW A ISOSCELES TRIANGLE");
        drawAnIsoscelesTriangle(3);
        System.out.println("\nDRAW A DIAMOND");
        drawADiamond(8);
        System.out.println("\nDRAW A DIAMOND WITH YOUR NAME");
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        renderTopRows(n);
        renderMiddleRow(n);
    }

    private static void renderTopRows(int middleRowNum) {
        for (int currentRowNum = 1; currentRowNum < middleRowNum; currentRowNum++) {
            System.out.println(renderRow(currentRowNum, middleRowNum));
        }
    }

    private static void renderBottomRows(int middleRowNum) {
        int totalRows = 1 + 2 * (middleRowNum - 1);

        for (int currentRowNum = middleRowNum + 1; currentRowNum <= totalRows; currentRowNum++) {
            System.out.println(renderRow(middleRowNum - (currentRowNum - middleRowNum), middleRowNum));
        }
    }

    private static String addCenteringSpaces(int currentRowNum, int middleRowNum) {
        String spaces = "";
        int numOfSpaces = middleRowNum - currentRowNum;

        for (int i = 0; i < numOfSpaces; i++) {
            spaces += " ";
        }
        return spaces;
    }

    private static String renderRow(int currentRowNum, int middleRowNum) {
        int stars = 2 * currentRowNum - 1;
        String row = addCenteringSpaces(currentRowNum, middleRowNum);

        for (int i = 1; i <= stars; i++) {
            row += "*";
        }
        return row;
    }

    private static void renderMiddleRow(int middleRowNum) {
        String centerString = "";
        int numOfStars = middleRowNum * 2 - 1;

        for (int i = 1; i <= numOfStars; i++) {
            centerString += "*";
        }
        System.out.println(centerString);
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        renderTopRows(n);
        renderMiddleRow(n);
        renderBottomRows(n);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {

    }
}
