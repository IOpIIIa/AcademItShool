package ru.academit.peretyagin.shapes;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(4);
        System.out.printf("%s%n%s%s%n%s%s%n%s%s", "Квадрат:", "Ширина = ", square.getWidth(), "Высота = ", square.getHeight(), "Площадь = ", square.getArea());

        System.out.println();

        Triangle triangle = new Triangle(2, -4, 3, 2, -6, 4);
        System.out.printf("%n%s%n%s%s%n%s%s%n%s%s", "Треугольник:", "Ширина = ", triangle.getWidth(), "Высота = ", triangle.getHeight(), "Площадь = ", triangle.getArea());

        System.out.println();

        Rectangle rectangle = new Rectangle(12, 5);
        System.out.printf("%n%s%n%s%s%n%s%s%n%s%s", "Прямоугольник:", "Ширина = ", rectangle.getWidth(), "Высота = ", rectangle.getHeight(), "Площадь = ", rectangle.getArea());

        System.out.println();

        Circle circle = new Circle(4);
        System.out.printf("%n%s%n%s%s%n%s%s%n%s%s", "Окружность:", "Диаметр = ", circle.getWidth(), "Диаметр = ", circle.getHeight(), "Площадь = ", circle.getArea());
    }
}
