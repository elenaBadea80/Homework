// 6. Use a while loop and print the first "n" integers.


import java.util.Scanner;

public class Hmw10oct6 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = Scanner.nextInt();
        int j = 0;

        while (j <= i) {
            System.out.println(j);
            j++;
        }
    }
}