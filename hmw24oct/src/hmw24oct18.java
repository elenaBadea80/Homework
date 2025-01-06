// 18. Write a method that takes two integers as parameters and returns the maximum of the two.

import java.util.Scanner;

public class hmw24oct18 {

    public static int maxNumber (int a,int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("The max between first an second number is: " + maxNumber(a,b) + ".");
    }
}
