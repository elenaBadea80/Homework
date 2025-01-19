//3. Use a lambda with Predicate<Integer> to check if a number is greater than 10.

import java.util.function.Predicate;

public class Hmw09ian3Predicate {
    public static void main(String[] args) {

        Predicate<Integer> isGrater = num -> num > 10;

        int i = 15;
        if (isGrater.test(i)){
            System.out.println("The number is grater than 10.");
        } else {
            System.out.println("The number is smaller than 10");
        }
    }
}
