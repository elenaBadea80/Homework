package container;

import java.util.ArrayList;
import java.util.List;

// 3. Design a Container<T> class that accepts only types that extend Number. Add methods to calculate the sum of all elements.
public class Container<T extends Number> {

    private List<T> tList;

    public Container() {
        this.tList = new ArrayList<>();
    }

    public void add(T tList1) {
        tList.add(tList1);
    }

    public double sum() {
        double total = 0.0;
        for ( T tList1 : tList){
            total += tList1.doubleValue();
        } return total;
    }


}

