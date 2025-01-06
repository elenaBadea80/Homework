// Write a program that takes an integer n and uses a for loop to print the first n even numbers.

import java.util.Scanner;

public class Hmw10oct9 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int i = Scanner.nextInt();

        for (int j = 0; j < i; j = j+2) {
            if (j <= 9) {
                System.out.println("Even numbers in the given integer are: " + j);

            } else {
                break;
            }
        }
// var Elena Man. in locul for ce am creat eu, a scris:
//        for (int k = 2; k <= i * 2; k += 2) {
//            System.out.println(k);
//        }
    }
}

// NEFINALIZAT