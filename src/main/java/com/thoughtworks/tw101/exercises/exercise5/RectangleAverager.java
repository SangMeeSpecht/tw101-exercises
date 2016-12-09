package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int currentRectangleSum = 0;

        for ( Rectangle rectangle : rectangles) {
            currentRectangleSum += rectangle.area();
        }

        return currentRectangleSum / rectangles.length;
    }
}
