package ru.academit.peretyagin.shapes;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }
    @Override
    public double getHeight() {
        return length;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
