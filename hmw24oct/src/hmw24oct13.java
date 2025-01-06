// 13. Write a program to check if a given string is a palindrome.

import java.util.Scanner;

public class hmw24oct13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the word.");
        String str1 = scanner.next();
        String reversedstr1 = new StringBuilder(str1).reverse().toString();

        System.out.println(reversedstr1);

       if (str1.equals(reversedstr1)){
           System.out.println("The " + str1 + " is a palindrom.");
       } else {
           System.out.println("The" + str1 + " is not a palindrom.");
       }
    }
}
