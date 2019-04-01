package com.company;

public class Circle extends Shape {

    int radius;

    public Circle() {

        super (new Point(2, 3));
        radius = 5;
        System.out.println("Circle Point: X:" + super.getPointX(0) + ", Y:" + super.getPointY(0));

        System.out.println("Circle Radius: " + radius + "\n");
    }

    public Circle(Point p1, int _radius) {
       super(p1);
       this.radius = _radius;
       System.out.println("Circle Point: X:" + super.getPointX(0) + ", Y:" + super.getPointY(0));
       System.out.println("Circle Radius: " + _radius + "\n");

    }

    public int getRadius() {
        return radius;
    }

    /*
    public Circle(String _shape) {
        this.shape = _shape;

    }

    public void setCenter (Point p1) {
        radius = 5;
        System.out.println("Circle Point: X:" + p1.x + " Y:" + p1.y);
        System.out.println("Circle Radius:" + radius + "\n");

    }
    */

}
