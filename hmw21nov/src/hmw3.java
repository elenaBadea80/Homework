// 3.Create a List<Double> with positive and negative numbers.
//  Write a method to remove all negative numbers from the list.
import java.util.ArrayList;
import java.util.List;

public class hmw3 {
    public static void main(String[] args) {

//      List<Double> numbers = List.of(2.5, -1.0, 10.5, -8.5, 7.0, -4.5, 12.0);
        List<Double> numbers = new ArrayList<>();

        numbers.add(2.5);
        numbers.add(-1.0);
        numbers.add(10.5);
        numbers.add(-8.5);
        numbers.add(7.0);
        numbers.add(-4.5);
        numbers.add(12.0);

        System.out.println(numbers);

        removeNegativenumbers(numbers);
        System.out.println(numbers);
    }

    public static void removeNegativenumbers(List<Double> numbers) {
        numbers.removeIf(number -> number < 0);
    }
}




