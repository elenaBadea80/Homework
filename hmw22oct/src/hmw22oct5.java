//5. Write a program to find all prime numbers up to a user-specified limit.

import java.util.Scanner;

public class hmw22oct5 {
    public static void main(String[] args) {

        System.out.println ("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        System.out.println("The prime number are: ");
        while(i<=num) {
            if(isPrime(i)) {
                System.out.print(i +"; ");
            }
            i++;
        }
    }

    public static boolean isPrime(int n) {
        if(n > 2 && (n & 1) == 0)
            return false;
        for(int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
