package com.company;
import java.util.ArrayList;

public abstract class Shape {

    private ArrayList<Point> points = new ArrayList<Point>();

    // Points
    Point pt1 = new Point(5, 10);
    Point pt2 = new Point(5, 20);
    Point pt3 = new Point(10, 10);
    Point pt4 = new Point(10, 20);



    public Shape(ArrayList<Point> _points) {
        points = _points;
    }

    public Shape (Point point) {
        points.add(point);
    }

    public void addPointsList(ArrayList<Point> _points) {
        points = _points;
    }

    public void addPoints (Point point) {
        points.add(point);
    }

    public Point getPoint(int index) {
        return points.get(index);
    }

    public int getPointX(int index) {
        return  points.get(index).getX();
    }

    public int getPointY(int index) {
        return  points.get(index).getY();
    }


    private Point point;


    protected String shape;


    /*
    //ZyBooks position methods
    protected Point position;

    public Point getPosition() {
        return this.position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }


    // points for creating shapes
/*
    Point pt1 = new Point(1, 3);
    Point pt2 = new Point(1, 7);
    Point pt3 = new Point(10, 3);
    Point pt4 = new Point(10, 7);

    public Point getPoint1() {
        return pt1;
    }



   public Point getPoint2() {
       return pt2;

   }

    public Point getPoint3() {
        return pt3;

    }

    public Point getPoint4() {
        return pt4;

    }

*/


}
