//8. Create a basic calculator program that accepts two numbers and an operator, and performs
// the operation using a switch statement.

import java.util.Scanner;

public class hmw24oct8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int i = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int j = scanner.nextInt();
        System.out.println("Enter an operator: ");
        String operator = scanner.next();

        switch (operator) {
            case "+" -> System.out.println("The result is :" + (i + j));
            case "*" -> System.out.println("The result is :" + (i * j));
            case "-" -> System.out.println("The result is :" + (i - j));
            case "/" -> {
                if (j != 0){
                    System.out.println("The result is :" + (i / j));
            }else {
                System.out.println("Enter a number different than zero.");
            }}
            default ->  System.out.println("Invalid operator.");
        }
    }
}
