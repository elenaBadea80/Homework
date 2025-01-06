// 7. Write a program that asks the user for a positive integer and uses a while loop to find
// the factorial of that number.
// Display the result.

import java.util.Scanner;

public class Hmw10oct7 {
    public static void main(String[] args) {

        Scanner Scanner=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int j =Scanner.nextInt();

        int i=1;
        int fact=1;

        while(i <= j)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of the number is: "+fact);
    }
}
