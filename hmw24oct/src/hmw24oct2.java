//2. Write a program that takes three numbers as input and prints the largest
// number using nested if statements.

import java.util.Scanner;

public class hmw24oct2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int i = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int j = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int k = scanner.nextInt();

        if (i > j && i > k) {
            System.out.println(i + " is the largest number.");
        } else if (j > i && j > k) {
            System.out.println(j + " is the largest number.");
        }else if(k>i && k>j) {
            System.out.println(k + " is the largest number.");
        }else {
            System.out.println("At least two numbers are equals.");
        }
    }
}
