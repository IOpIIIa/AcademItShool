package ru.academit.peretyagin.Range;

public class Range {

    private double from;
    private double to;

    public Range(double from, double to){
        this.from = from;
        this.to = to;
    }
    public double getLength() {
        return this.to - this.from;
    }
    public boolean getisInside(double intervalTest) {
        return intervalTest >= from && intervalTest <= to;
    }
}
