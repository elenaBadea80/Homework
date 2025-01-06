// 4. Create a program that takes an integer input (1-7) representing a day of the week and uses a
// switch statement to print the name of the day (e.g., 1 = "Monday", 2 = "Tuesday", etc.).
// Please use Java 14+ Switch statement).

import java.util.Scanner;

public class Hmw10oct4 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Choose a number between 1 and 7.");
        int weekday = Scanner.nextInt();

        switch (weekday){
            case 1:
                System.out.println("This day is Monday.");
                break;
            case 2:
                System.out.println("This day is Tuesday.");
                break;
            case 3:
                System.out.println("This day in Wednesday.");
                break;
            case 4:
                System.out.println("This day is Thursday.");
                break;
            case 5:
                System.out.println("This day is Friday.");
                break;
            case 6:
                System.out.println("This day is Saturday");
                break;
            case 7:
                System.out.println("This day is Sunday.");
                break;
            default:
                System.out.println("Choose a number between 1 and 7.");
        }
    }
}
