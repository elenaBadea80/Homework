//10. Initialize an array of integers with 10 random values. Use a for loop to find and print the
// smallest and largest elements in the array.

import java.util.Scanner;

public class Hmw10oct10 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int [] a = { -2,17, 7, 10, 12, 57, 77, 87, 76, 43};
        int smallest = a[0];
        int largest = a[0];
        for (int j = 0; j < a.length; j++) {
            smallest = Math.min(smallest, a[j]);
            largest = Math.max(largest,a[j]);
        }
            System.out.println("\nMinimum Value in the Array is: " + smallest);
            System.out.println("\nMinimum Value in the Array is: " + largest);

    }
}
