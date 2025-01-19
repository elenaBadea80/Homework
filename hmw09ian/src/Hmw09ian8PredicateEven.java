// 8. Use the built-in Predicate<Integer> functional interface to check if a number is even.

import java.util.function.Predicate;

public class Hmw09ian8PredicateEven {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        int i = 248;
        if (isEven.test(i)){
            System.out.println("The number is even.");
        } else {
            System.out.println("The numeber is odd.");
        }
    }
}
