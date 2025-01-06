// 19. Write a method that checks if a number is prime or not.

import java.util.Scanner;

public class hmw24oct19 {

    public static boolean isPrime (int a){
        for (int j = 2; j < a; j++)
            if (a % j == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = scanner.nextInt();

        if (i <= 1) {
            System.out.println("Enter a number bigger than 2.");
        }
        else if (isPrime(i)) {
            System.out.println("The number " + i + " is prime.");
        } else {
            System.out.println("The number " + i + " is not prime.");
    }
    }
}