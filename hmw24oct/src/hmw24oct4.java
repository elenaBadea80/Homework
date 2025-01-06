//4. Write a program to calculate the sum of the first N natural numbers using a
// while loop.

import java.util.Scanner;

public class hmw24oct4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = scanner.nextInt();
        int j = 0;
        int sum = 0;
        if (i >= 0) {
            while (j <= i) {
                sum = sum + j;
                j++;
            }
            System.out.println(sum);
        } else {
            System.out.println("Enter a positive number.");
        }
    }
}
