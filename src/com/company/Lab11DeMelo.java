/*
Project: Lab 11
Purpose Details: Apply inheritance
Course: IST 242-001
Author: Nahara Melodonascimentodemou
Date Developed: 3/28/19
Last Date Changed: 3/31/19
Rev: 5
 */

package com.company;

import org.w3c.dom.css.Rect;

public class Lab11DeMelo {
    public static void main(String[] args) {

        // Points
        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 20);
        Point p3 = new Point(10, 10);
        Point p4 = new Point(10, 20);



        // Circle
        System.out.println("CIRCLE");
        Circle circle = new Circle();
        Circle c = new Circle(p1, 5);


        // Rectangle
        System.out.println("RECTANGLE");
        Rectangle rectangle = new Rectangle();
        Rectangle r = new Rectangle(p1, p2, p3, p4);


        // Triangle
        System.out.println("TRIANGLE");
        Triangle triangle = new Triangle();
        Triangle t = new Triangle(p1, p2, p3);








        /*
// Points
        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 20);
        Point p3 = new Point(10, 10);
        Point p4 = new Point(10, 20);


//Circle
        System.out.println("CIRCLE");
        Circle c1 = new Circle();
        Circle c2 = new Circle() ;


//Rectangle
        System.out.println("RECTANGLE");
        Rectangle r = new Rectangle();
        //Rectangle r1 = new Rectangle(p1, p2, 10, 4);
        Rectangle r2 = new Rectangle(p1, p2, p3, p4);

//Triangle
        System.out.println("TRIANGLE");
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(p1, p2, p3);

*/
/*
        // using methods in Shape class

        System.out.println("Creating Shapes using Points and methods of the Shape class:\n");

        System.out.println("CIRCLE");
        Circle cir = new Circle("Circle");
        cir.setCenter(cir.getPoint1());

        System.out.println("RECTANGLE");
        Rectangle rec = new Rectangle("Rectangle");
        rec.setPoints(rec.getPoint1(), rec.getPoint2(), rec.getPoint3(), rec.getPoint4());


        System.out.println("TRIANGLE");
        Triangle tria = new Triangle("Triangle");
        tria.setPoints(tria.getPoint1(), tria.getPoint2(), tria.getPoint3());

*/
    }
}
