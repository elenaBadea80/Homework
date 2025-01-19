// 1. Sort a list of integers in ascending order using an anonymous class for the comparator.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hmw09ian1Anonymous {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(21);
        numbers.add(3);
        numbers.add(15);
        numbers.add(2);
        numbers.add(17);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println("Sorte list: " + numbers);
    }
}
