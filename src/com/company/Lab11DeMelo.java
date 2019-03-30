package com.company;

public class Lab11DeMelo {
    public static void main(String[] args) {
        Point pt1 = new Point(1, 3);
        Point pt2 = new Point(1, 7);
        Point pt3 = new Point(5, 3);

        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 20);
        Point p3 = new Point(10, 10);
        Point p4 = new Point(10, 20);

//Circle
        Circle c1 = new Circle();
        Circle c2 = new Circle(p1);


//Rectangle
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(pt1, pt2, 10, 4);
        Rectangle r2 = new Rectangle(p1, p2, p3, p4);


//Triangle
        Triangle t1 = new Triangle(pt1, pt2, pt3);
        Triangle t2 = new Triangle(pt1, p1, p2);

    }
}
