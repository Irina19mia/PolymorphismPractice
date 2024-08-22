package app;

import app.shape.Circle;
import app.shape.Shape;
import app.shape.Square;
import app.shape.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(2.5, 3);
        Shape square = new Square(5);

        Shape[] shapes = new Shape[]{circle, triangle, square};

        System.out.printf("Площа кола: %.2f%n", circle.area());
        System.out.printf("Площа трикутника: %.2f%n", triangle.area());
        System.out.printf("Площа квадрату: %.2f%n", square.area());

        System.out.printf("Сумарна площа фігур: %.2f%n", totalArea(shapes));
    }

    private static double totalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape: shapes) {
            totalArea += shape.area();
        }

        return totalArea;
    }

}
