// verificati daca un numar par sau impar

import java.util.Scanner;

public class Hmw08oct5 {
    public static void main(String[] args) {

        Scanner Numar = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int par = Numar.nextInt();

        boolean iseven = par % 2 == 0 ? true : false;
        if (iseven) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
