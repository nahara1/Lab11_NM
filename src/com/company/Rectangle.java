package com.company;

public class Rectangle extends Shape {

    private int length, height;

    public Rectangle() {

        Point pt1 = new Point(2, 3);
        Point pt2 = new Point(pt1.x, 6);
        Point pt3 = new Point(7, pt1.y);
        Point pt4 = new Point(pt3.x, pt2.y);
        System.out.println("Rectangle Points: (" + pt1.x + ", " + pt1.y + "), " + "(" + pt2.x + ", " + pt2.y + "), " + "(" + pt3.x + ", " + pt3.y + "), " + "(" + pt4.x + ", " + pt4.y + ")");

    }



    public Rectangle(Point p1, Point p2) {
        System.out.println("Rectangle Points: X:" + p1.x + " Y:" + p1.y + ", X:" + p2.x + " Y:" + p2.y + "\n");

    }

    // point, length, and height

    public Rectangle(Point p1, Point p2, int length, int height) {
        System.out.println("Rectangle Point 1: X:" + p1.x + " Y:" + p1.y);
        System.out.println("Rectangle Point 2: X:" + p2.x + " Y:" + p2.y);
        System.out.println("Height: " + height);
        System.out.println("Length: " + length + "\n");

    }

    // 4 points
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {

        //System.out.println("Rectangle Point: X:" + p1.x + " Y:" + p1.y);
        //System.out.println("Rectangle Point: X:" + p1.x + " Y:" + p1.y + " Length:" + length + " Height:" + height);
        System.out.println("Rectangle Points: (" + p1.x + ", " + p1.y + "), " + "(" + p2.x + ", " + p2.y + "), " + "(" + p3.x + ", " + p3.y + "), " + "(" + p4.x + ", " + p4.y + ")" + "\n");

    }
}
