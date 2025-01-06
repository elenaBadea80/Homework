//Determine if a given year is a leap year.

import java.util.Scanner;

public class Hmw08oct4 {
    public static void main(String[] args) {

        Scanner Leap = new Scanner(System.in);
        System.out.print("Verify if this year is a leap year: ");
        int year = Leap.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print("This year is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}






