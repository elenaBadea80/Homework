//1. Write a program that takes an integer input from the user and checks if it is positive, negative,
// or zero. Display a message indicating the result.

import java.util.Scanner;

public class Hmw10oct1 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Write you number: ");
        int i = Scanner.nextInt();

        if ( i > 0) {
            System.out.println("Your number is positive.");

            } else if (i == 0 ) {
            System.out.println("Your number is zero.");
        } else {
            System.out.println("You number is negative.");

        }
    }
}
