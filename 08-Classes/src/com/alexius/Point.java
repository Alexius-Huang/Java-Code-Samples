package com.alexius;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        int distX = Math.abs(x - this.x);
        int distY = Math.abs(y - this.y);
        return Math.sqrt(distX * distX + distY * distY);
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point p) {
        return this.distance(p.getX(), p.getY());
    }

}
