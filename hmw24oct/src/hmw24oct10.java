// 10. Write a program that calculates the sum of all elements in an array.

import java.util.Scanner;

public class hmw24oct10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {4,6,8,9,100,-5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
