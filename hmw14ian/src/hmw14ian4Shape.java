
// Create a Shape interface and several classes that implement it (e.g., Circle, Rectangle, Triangle):
//
//Each class should have attributes like double area and double perimeter.
//
//- Write a Comparator<Shape> to compare shapes by their area.
//- Create a list of shapes with different areas and types.
//
//- Use streams to:
//-- Filter shapes with an area greater than a given value.
//-- Find the smallest shape by area using a lambda or method reference.
//-- Group shapes by their type (e.g., Circle, Rectangle, etc.).

import java.util.*;
import java.util.stream.Collectors;

public class hmw14ian4Shape {
    public static void main(String[] args) {

        List<Shape> shapeList = Arrays.asList(
                new Cilcle(4),
                new Triangle(5, 9, 7, 8),
                new Rectangle(7, 8),
                new Cilcle(3),
                new Triangle(3, 6, 4, 5),
                new Rectangle(3, 4)
        );

        List<Shape> shapeMaxArea = shapeList.stream()
                .filter(s -> s.getArea() > 15)
                .toList();

        shapeMaxArea.forEach(System.out::println);

        OptionalDouble minArea = shapeList.stream()
                .mapToDouble(Shape::getArea)
                .min();

        List<Shape> shapeMinArea = new ArrayList<>();

        if (minArea.isPresent()) {
            double minAreaValue = minArea.getAsDouble();
            shapeMinArea = shapeList.stream()
                    .filter(s -> s.getArea() == minAreaValue)
                    .toList();
        }
        System.out.println(" ");
        shapeMinArea.forEach(System.out::println);

        Map<String, List<Shape>> shapeByType = shapeList.stream()
                .collect(Collectors.groupingBy(Shape::getType));

        System.out.println(" ");
        shapeByType.forEach((type, shapeListType) -> {
            System.out.println(type + ":");
            shapeListType.forEach(s -> System.out.println(" " + s));
        });

    }
}

interface Shape {
    double getArea();

    double getPerimeter();

    String getType();

}

class Cilcle implements Shape {
    private double radius;
    private double area;
    private double perimeter;

    public Cilcle(double radius) {
        this.radius = radius;
        this.area = radius * radius;
        this.perimeter = 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Cilcle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

class Rectangle implements Shape {
    private double lenght;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
        this.area = lenght * width;
        this.perimeter = 2 * lenght + 2 * width;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}


class Triangle implements Shape {
    private double base;
    private double height;
    private double area;
    private double perimeter;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.area = (base * height) / 2;
        this.perimeter = base + side1 + side2;


    }
}

class ShapeAreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        return Double.compare(s1.getArea(), s2.getArea());
    }
}