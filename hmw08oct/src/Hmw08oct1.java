
// Read an integer input from the user, representing a person's age, and use conditionals to check if the user is an adult (18 or older).

import java.util.Scanner;

// varianta mea

public class Hmw08oct1 {
    public static void main(String[] args) {

       Scanner Age = new Scanner(System.in);
        System.out.print("Your Age is: ");

        int YourAge = Age.nextInt();

        if (YourAge >= 18) {
            System.out.println("You are an adult.");
        }else if (YourAge >= 0){
            System.out.println("You are not an adult.");
        } else {
            System.out.println("Invalid age.");
        }
    }
}

// varianta prezentatorului : la fel
