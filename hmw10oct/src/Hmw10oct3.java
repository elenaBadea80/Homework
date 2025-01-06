//3. Write a program that prompts the user to enter two numbers and an operator (+, -, *, /).
// Use a switch statement to perform the chosen operation and display the result (store the result in a
// variable using Java 14+ Switch statement).


import java.util.Scanner;

public class Hmw10oct3 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Write two numbers: ");
        int i = Scanner.nextInt();
        int j = Scanner.nextInt();

        System.out.println("Choose one of the following operators: +, -, *, /.");
        String operator = Scanner.next();

        switch (operator) {
            case "+":
                System.out.println("The result is: " + (i + j));
                break;
            case "-":
                System.out.println("Thr result is: " + (i - j));
                break;
            case "*":
                System.out.println("The result is: " + (i * j));
                break;
            case "/":
                if (j != 0) {
                    System.out.println("The result is: " + (i / j));
                } else {
                    System.out.println("The operation can't be executed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
