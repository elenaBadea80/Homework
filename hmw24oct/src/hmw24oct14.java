// 14. Write a program that counts the number of vowels in a given string.

import java.util.Scanner;

public class hmw24oct14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the word.");
        String str = scanner.next();
        System.out.println();
        System.out.println("The number of vowels is: " + countVowel(str));
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u');
    }

    public static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i)))
            count++;
            return count;
        }
}
