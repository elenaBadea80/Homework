// 25. Write a method that checks if a given number is a palindrome (e.g., 121, 12321 are palindromes).

import java.util.Scanner;

public class hmw24oct25 {

    public static boolean checkPalindrome (int a) {

        String str = Integer.toString(a);
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number: ");
        int i = scanner.nextInt();

        if (checkPalindrome(i)) {
           System.out.println("The number " + i + " is a paloindrom.");
        } else {
            System.out.println("The number " + i + " is not a palindrom.");
        }
    }
}
