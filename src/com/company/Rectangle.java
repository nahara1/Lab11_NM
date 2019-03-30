package com.company;

public class Rectangle extends Shape {

    private int length, height;

    public Rectangle() {

        Point pt1 = new Point(2, 3);
        Point pt2 = new Point(pt1.x, 6);
        Point pt3 = new Point(7, pt1.y);
        Point pt4 = new Point(pt3.x, pt2.y);
        System.out.println("Rectangle Points: (X: " + pt1.x + ", Y:" + pt1.y + "), (X:" + pt2.x + ", Y:" + pt2.y + "), (X:" + pt3.x + ", Y:" + pt3.y + "), (X:" + pt4.x + ", Y:" + pt4.y + ")" + "\n");

    }


    // 2 points, length, and height

    public Rectangle(Point p1, Point p2, int length, int height) {
        System.out.println("Rectangle Points: X:" + p1.x + " Y:" + p1.y + "\n" + "X:" + p2.x + " Y:" + p2.y);
        System.out.println("Length: " + length + "\n" + ", Height: " + height);

    }

    // 4 points
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        System.out.println("Rectangle Points: (X: " + p1.x + ", Y:" + p1.y + "), (X:" + p2.x + ", Y:" + p2.y + "), (X:" + p3.x + ", Y:" + p3.y + "), (X:" + p4.x + ", Y:" + p4.y + ")" + "\n");

    }
}
