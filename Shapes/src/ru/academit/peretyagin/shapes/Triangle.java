package ru.academit.peretyagin.shapes;

public class Triangle implements Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3) - Math.min(x1, Math.min(x2, x3)));
    }
    @Override
    public double getHeight() {
        return Math.max(y1, Math.min(y2, y3) - Math.min(y1, Math.min(y2, y3)));
    }
    @Override
    public double getArea() {
        return Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) * 0.5);
    }
}
