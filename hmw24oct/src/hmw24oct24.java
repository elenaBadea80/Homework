// 24. Write a method that checks if a given year is a leap year or not. Use this method in the main
// program to check several year values.

import java.util.Scanner;

public class hmw24oct24 {

    public static boolean leapYear (int a) {

        if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the year: ");
        int i = scanner.nextInt();
        if (i < 0){
            System.out.println("Enter a positive number and bigger than zero.");
        }
        else if (leapYear(i)) {
            System.out.println("The year " + i + " is a leap year.");
        } else {
            System.out.println("The year " + i + " is not a leap year.");
        }
    }
}
