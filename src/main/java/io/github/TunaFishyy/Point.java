package io.github.TunaFishyy;

public class Point {

    private int a;
    private float b;

    Point() { System.out.println("Zovemooo construcotor!!"); }

    public Point setInt(int a) {
        this.a = a;
        return this;
    }

    public Point setFloat(float b) {
        this.b = b;
        return this;
    }

    void display() { System.out.println("Display: " + a + " " + b); }

}

class A {

    public static void main(String[] args) {

        Point p = new Point();
        p.setInt(4).setFloat(3).display();

    }

}