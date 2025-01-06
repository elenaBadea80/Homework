// 1. Create a basic calculator that performs addition, subtraction, multiplication, and division using methods.

import java.util.Scanner;

public class hmw22oct1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        int sum = doSum(a, b);
        System.out.println(sum);
        int substr = doSubstr(a,b);
        System.out.println(doSubstr(a,b));
        int multiply = doMultiply(a,b);
        System.out.println(doMultiply(a,b));
        int div = doDiv(a,b);
        System.out.println(doDiv(a,b));
    }

    public static int doSum(int a, int b) {
        return a + b;

    }
    public static int doSubstr(int a, int b) {
        return a - b;
    }
    public static int doMultiply( int a, int b) {
        return a*b;

    }
    public static int doDiv(int a, int b) {
        return a/b;
    }

}
