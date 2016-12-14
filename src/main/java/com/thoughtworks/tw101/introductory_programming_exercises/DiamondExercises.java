package com.thoughtworks.tw101.introductory_programming_exercises;

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
        int middleLength = 2 * n - 1;
        renderTopRows(n, middleLength);
        renderMiddleRowStars(middleLength);
    }

    private static void renderTopRows(int middleRowNum, int middleRowLength) {
        for (int currentRowNum = 1; currentRowNum < middleRowNum; currentRowNum++) {
            System.out.println(renderRow(currentRowNum, middleRowLength));
        }
    }

    private static void renderBottomRows(int middleRowNum, int middleRowLength) {
        int totalRows = 1 + 2 * (middleRowNum - 1);

        for (int currentRowNum = middleRowNum + 1; currentRowNum <= totalRows; currentRowNum++) {
            System.out.println(renderRow(middleRowNum - (currentRowNum - middleRowNum), middleRowLength));
        }
    }

    private static String addCenteringSpaces(int currentRowNum, int middleNumOfChars) {
        String spaces = "";
        int numOfCharsInRow = 2 * currentRowNum - 1;
        int numOfSpaces = ((middleNumOfChars - numOfCharsInRow) / 2);
        for (int i = 0; i < numOfSpaces; i++) {
            spaces += " ";
        }
        return spaces;
    }

    private static String renderRow(int currentRowNum, int middleRowLength) {
        int stars = 2 * currentRowNum - 1;
        String row = addCenteringSpaces(currentRowNum, middleRowLength);

        for (int i = 1; i <= stars; i++) {
            row += "*";
        }
        return row;
    }

    private static void renderMiddleRowStars(int middleRowLength) {
        String centerString = "";

        for (int i = 1; i <= middleRowLength; i++) {
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
        int middleLength = 2 * n - 1;
        renderTopRows(n, middleLength);
        renderMiddleRowStars(middleLength);
        renderBottomRows(n, middleLength);
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
        String name = "SangMee";
        int stringLength = name.length();

        renderTopRows(n, stringLength);
        System.out.println(name);
        renderBottomRows(n, stringLength);

    }



}
