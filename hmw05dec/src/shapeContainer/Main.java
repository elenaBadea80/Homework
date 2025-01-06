package shapeContainer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShapeContainer<Shape> container = new ShapeContainer<>();

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(6, 5);

        container.addShape(circle);
        container.addShape(rectangle);

        circle.arrea();
        rectangle.arrea();

        List<Circle> newCircle = new ArrayList<>();
        newCircle.add(new Circle(7));


    }
}
