//8.Create a program that keeps asking the user for integers until the user enters a negative number.
// Calculate and print the sum of all positive numbers entered.

import java.util.Scanner;

public class Hmw10oct8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        var 1
        int i;
        int sum = 0;
//        do {
//            System.out.println("Enter the number: ");
//            i = scanner.nextInt();
//            sum = sum + i;
//        } while (i > 0);
//        System.out.println("The sum of all positive numbers entered is: " + sum);



        while (true) {
            System.out.println("Enter the number: ");
            i = scanner.nextInt();
            if(i <=0) {
                break;
            }sum = sum + i;
                System.out.println("The sum of all positive numbers entered is: " + sum);
            }
    }
}

// NEFINALIZAT