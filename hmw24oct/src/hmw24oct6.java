//6. Write a program that reverses the digits of an integer using a do-while loop.

import java.util.Scanner;

public class hmw24oct6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = scanner.nextInt();
        int reverse = 0;
        do {
            int digit = i % 10;
            reverse = reverse * 10 + digit;
            i /= 10;
        }
        while (i != 0);
        System.out.println("Reversed number of is: " + reverse);
    }
}
