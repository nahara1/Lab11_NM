/*
Project: Lab 11
Purpose Details: Apply inheritance
Course: IST 242-001
Author: Nahara Melodonascimentodemou
Date Developed: 3/28/19
Last Date Changed: 3/30/19
Rev: 3
 */

package com.company;

public class Lab11DeMelo {
    public static void main(String[] args) {

// Points
        Point pt1 = new Point(1, 3);
        Point pt2 = new Point(1, 7);
        Point pt3 = new Point(5, 3);

        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 20);
        Point p3 = new Point(10, 10);
        Point p4 = new Point(10, 20);

        System.out.println("CIRCLE");
        Circle c1 = new Circle();
        Circle c2 = new Circle(p1);


//Rectangle
        System.out.println("RECTANGLE");
        Rectangle r = new Rectangle();
        //Rectangle r1 = new Rectangle(p1, p2, 10, 4);
        Rectangle r2 = new Rectangle(p1, p2, p3, p4);


//Triangle
        System.out.println("TRIANGLE");
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(p1, p2, p3);

    }
}
