package com.company;

public class Triangle extends Shape {

    String shape;

    public Triangle () {
        super (new Point(5, 5));
        super.addPoints(pt2);
        super.addPoints(pt3);
        System.out.println("Triangle Points: (X:" + super.getPointX(0) + ", Y:" + super.getPointY(0) + "), " + "(X:" + super.getPointX(1) + ", Y:" + super.getPointY(1) + "), (X:" + super.getPointX(2) + ", Y:" + super.getPointY(2) + ")\n");

    }

    public Triangle (Point p1, Point p2, Point p3) {
        super (p1);
        super.addPoints(p2);
        super.addPoints(p3);
        //System.out.println("Triangle Points: (X:" + super.getPointX(0) + ", Y:" + super.getPointY(0) + "), " + "(X:" + p2.x + ", Y:" + p2.y + "), " + "(X:" + p3.x + ", Y:" + p3.y + ")\n");
        System.out.println("Triangle Points: (X:" + super.getPointX(0) + ", Y:" + super.getPointY(0) + "), " + "(X:" + super.getPointX(1) + ", Y:" + super.getPointY(1) + "), (X:" + super.getPointX(2) + ", Y:" + super.getPointY(2) + ")\n");

    }


/*
    public Triangle(Point p1, Point p2, Point p3) {
        this.position = p1;
        System.out.println("Triangle Points: (X:" + p1.x + ", Y:" + p1.y + "), " + "(X:" + p2.x + ", Y:" + p2.y + "), " + "(X:" + p3.x + ", Y:" + p3.y + ")\n");

    }

*/

    // to use  Shape class method
   /*
    public Triangle (String _shape) {

        this.shape = _shape;
    }

    public void setPoints(Point p1, Point p2, Point p3) {
        System.out.println("Triangle Points: (X:" + p1.x + ", Y:" + p1.y + "), " + "(X:" + p2.x + ", Y:" + p2.y + "), " + "(X:" + p3.x + ", Y:" + p3.y + ")\n");

    }
    */




}
