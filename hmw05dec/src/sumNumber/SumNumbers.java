package sumNumber;
// 19. Write a method sumNumbers(List<? extends Number> numbers) that computes the sum of all elements in the list.

import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    // Metodă generică pentru a calcula suma numerelor dintr-o listă
    public static double printSumNumbers(List < ? extends Number > numbers){
        double sum = 0.0;
        for (Number number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intNumbers = Arrays.asList(1,2,3,4,5);
        System.out.println("The sum is: " + printSumNumbers(intNumbers));

        List<Double> doubleNumbers = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Suma numerelor reale: " +printSumNumbers(doubleNumbers));
    }


}
