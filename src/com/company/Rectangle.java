package com.company;

public class Rectangle extends Shape {

    private int length, height;
    Point p, o, i, n;

    public Rectangle() {

        Point pt1 = new Point(2, 3);
        Point pt2 = new Point(2, 6);
        Point pt3 = new Point(7, 3);
        Point pt4 = new Point(7, 6);
        System.out.println("Rectangle Coordinates: (" + pt1.x + ", " + pt1.y + "), " + "(" + pt2.x + ", " + pt2.y + "), " + "(" + pt3.x + ", " + pt3.y + "), " + "(" + pt4.x + ", " + pt4.y + ")");


    }



    public Rectangle(Point p1) {
        System.out.println("Rectangle Point: X:" + p1.x + " Y:" + p1.y);

    }

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {

        this.p = p1;
        this.o = p2;
        this.i = p3;
        this.n = p4;
        //System.out.println("Rectangle Point: X:" + p1.x + " Y:" + p1.y);
        //System.out.println("Rectangle Point: X:" + p1.x + " Y:" + p1.y + " Length:" + length + " Height:" + height);
        System.out.println("Rectangle Coordinates: (" + p1.x + ", " + p1.y + "), " + "(" + p2.x + ", " + p2.y + "), " + "(" + p3.x + ", " + p3.y + "), " + "(" + p4.x + ", " + p4.y + ")");

    }
}
