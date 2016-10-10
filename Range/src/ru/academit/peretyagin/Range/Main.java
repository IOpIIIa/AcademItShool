package ru.academit.peretyagin.Range;

public class Main {
    public static void main(String[] args) {

        Range range = new Range(3, 18);
        double intervalTest = 5;

        System.out.println("Длинна интервала = " + range.getLength());

        if(range.getisInside(intervalTest)) {
            System.out.println("Число принадлежит диапазону");
        } else {
            System.out.println("Число не принадлежит диапазону");
        }
    }
}
