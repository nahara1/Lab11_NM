package com.company;

public class Triangle extends Shape {
    public Triangle () {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 10);
        Point p3 = new Point(5, 20);
    }

    public Triangle(Point p1, Point p2, Point p3) {

        System.out.println("Triangle Coordinates: (" + p1.x + ", " + p1.y + "), " + "(" + p2.x + ", " + p2.y + "), " + "(" + p3.x + ", " + p3.y + ")" + "\n");

    }
}
