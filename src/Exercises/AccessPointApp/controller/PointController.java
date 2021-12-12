package Exercises.AccessPointApp.controller;

import Exercises.AccessPointApp.data.Point;

public class PointController {

    public void addX(Point point){
        int val = point.getX();
        point.setX(++val);
    }

    public void minusX(Point point){
        int val = point.getX();
        point.setX(--val);
    }

    public void addY(Point point){
        int val = point.getY();
        point.setY(++val);
    }

    public void minusY(Point point){
        int val = point.getY();
        point.setY(--val);
    }
}
