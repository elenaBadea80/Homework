//11. Create a program that takes a list of 5 names from the user and stores them in a String array.
// Use a for loop to display each name in reverse order.

import java.util.Scanner;

public class Hmw10oct11 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Write fives names: ");
        String names1 = Scanner.nextLine();
        String names2 = Scanner.nextLine();
        String names3 = Scanner.nextLine();
        String names4 = Scanner.nextLine();
        String names5 = Scanner.nextLine();

        String[] names = {names1, names2, names3,names4, names5};
        for (int i = 4; i >= 0; i-- ){
        System.out.println(names[i]);
        }
    }
}
