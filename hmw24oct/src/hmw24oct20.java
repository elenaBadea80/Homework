// 20. Write a recursive method to generate the Fibonacci sequence up to a given number of terms.

import java.util.Scanner;

public class hmw24oct20 {

    public static int fib(int n) {

        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // var 1
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

//       var 2
//      public static void main(String args[]) {
//
//           int N = 10;
//           for (int i = 0; i < N; i++) {
//           System.out.print(fib(i) + " ");
//        }
//

