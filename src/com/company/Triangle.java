package com.company;

public class Triangle extends Shape {
    public Triangle () {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 10);
        Point p3 = new Point(10, 20);
        System.out.println("Triangle Points: (X:" + p1.x + ", Y:" + p1.y + "), " + "(X:" + p2.x + ", Y:" + p2.y + "), " + "(X:" + p3.x + ", Y:" + p3.y + ")\n");

    }

    public Triangle(Point p1, Point p2, Point p3) {

        System.out.println("Triangle Points: (X:" + p1.x + ", Y:" + p1.y + "), " + "(X" + p2.x + ", Y:" + p2.y + "), " + "(X:" + p3.x + ", Y:" + p3.y + ")\n");

    }
}
