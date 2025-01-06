//5. Create a program that calculates the factorial of a number using a while loop.

import java.util.Scanner;

public class hmw24oct5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = scanner.nextInt();
        int j = 1;
        int fact = 1;
        if (i > 0) {
            while (j <= i) {
                fact = fact * j;
                j++;
            }
            System.out.println("The factorial value of number is: " + fact);
        } else {
            System.out.println("Enter a positive number.");
        }
        }
    }


