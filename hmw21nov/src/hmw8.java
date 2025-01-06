// 8.Create a TreeSet<Integer> and add random integers. Verify that the integers are stored in ascending order.

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class hmw8 {
    public static void main(String[] args) {
        Set<Integer> numberes = new TreeSet<>();

        Random randomNo = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber = randomNo.nextInt(100);
            numberes.add(randomNumber);
            System.out.println("Add the number: " + randomNumber);
        }

        System.out.println(numberes);
    }
}
