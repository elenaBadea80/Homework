//2. Create a program that takes an integer and checks if it is divisible by both 2 and 3.
// Print "Divisible by both" if true, "Divisible by only 2" if divisible by 2 but not 3,
//"Divisible by only 3" if divisible by 3 but not 2, and "Not divisible by either" otherwise.

import java.util.Scanner;

public class Hmw10oct2 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Verify if the number is divisible by 2 and 3.");
        System.out.print("Write a number: ");
        int i = Scanner.nextInt();


        boolean divisibil = i != 0 && i % 2 == 0 && i % 3 == 0 ? true : false;
        if (divisibil) {
        System.out.println("Divisible by both. ");
        }   else if (i != 0 && i % 2 == 0 && i % 3 != 0) {
            System.out.println("Divisible by only 2.");
            } else if (i != 0 && i % 3 == 0 && i % 2 != 0) {
            System.out.println("Divisible by only 3.");
                } else if (i == 0) {
                System.out.println("Choose a number diferent by zero.");
        } else {
            System.out.println("Not divisible by both.");

        }
    }
}


