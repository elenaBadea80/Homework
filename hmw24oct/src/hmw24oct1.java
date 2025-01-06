//1. Write a program that checks if a given integer is even or odd using an if statement.

import java.util.Scanner;

public class hmw24oct1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = scanner.nextInt();

        if (i == 0) {
            System.out.println("Enter a number bigger than 0.");
        }else if ( i % 2 == 0){
            System.out.println( i + " is an even number.");
        } else {
            System.out.println( i + " is an odd number.");
        }
    }

}
