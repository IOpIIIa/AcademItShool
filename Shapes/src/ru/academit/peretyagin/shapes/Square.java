package ru.academit.peretyagin.shapes;

public class Square implements Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getWidth() {
        return sideLength;
    }
    @Override
    public double getHeight() {
        return sideLength;
    }
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
