//22. Write a method that takes an integer array as input and returns a new array with the elements reversed.

import java.util.Arrays;

public class hmw24oct22 {

    public static int[] reverse(int[] arr) {

        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[arr.length - 1 - i] = arr[i];
            }
            return newArray;
}

    public static void main(String[] args) {

        int[] arr1 = {5,8,21,67,41,16,32};
        int[] reversedarr1 = reverse(arr1);
        System.out.println();
        System.out.println("The original array is: " + Arrays.toString(arr1));
        System.out.println("The new array is: " + Arrays.toString(reversedarr1));
    }
}
