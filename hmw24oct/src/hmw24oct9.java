//9. Write a program to find the largest element in an array of integers.

import java.util.Scanner;

public class hmw24oct9 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int[] i = {11,88,56,77,101, 578, 321,32,99,6};
        int max = i[0];
        for (int j = 0; j < i.length; j++) {
            max = Math.max(max,i[j]);
        }
        System.out.println("The largets number in the array is " + max);
    }

}
