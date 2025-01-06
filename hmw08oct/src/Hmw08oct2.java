//Take an integer score as input and determine if the student passes or fails.

import java.util.Scanner;

public class Hmw08oct2 {
    public static void main(String[] args) {

        Scanner Score = new Scanner(System.in);

        System.out.print("Your score is: ");

        int YourScore = Score.nextInt();

        if (YourScore >= 7) {
            System.out.println("Congratulation! You passed the exam. ");

        } else {
            System.out.println("You failed the exam. ");


        }
    }
}
