package shapeContainer;

import java.util.ArrayList;
import java.util.List;

// NEREZOLVATA

// 4. Create a class ShapeContainer<T> that stores shapes like Circle and Rectangle.
// Use wildcards to filter shapes or add multiple shapes from a list.
public class ShapeContainer<T extends Shape> {

    private List<T> shapes = new ArrayList<>();

    public void addShape(T shape){
        shapes.add(shape);
    }

    public void addNewShape(List< ? extends T> shapeList){
        shapes.addAll(shapeList);
    }

// Metodă pentru a filtra formele după tipul lor
    public <U extends T> List<U> getShapesOfType(Class<U> type) {
        List<U> result = new ArrayList<>(); for (T shape : shapes) {
            if (type.isInstance(shape)) {
                result.add(type.cast(shape));
            }
        } return result;
    }

}
