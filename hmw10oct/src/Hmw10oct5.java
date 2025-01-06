// 5. Write a program that takes a single letter as input and uses a switch statement to determine if
// it’s a vowel (a, e, i, o, u) or a consonant.
// If it’s not a letter, display "Invalid input."

import java.util.Scanner;

public class Hmw10oct5 {
    public static void main(String[] args) {

        System.out.println("Write a letter:");
        Scanner Scanner = new Scanner(System.in);

        char letter = Scanner.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("The letter is a vowel.");
                    break;
                default:
                    System.out.println("The letter is a consonant.");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
