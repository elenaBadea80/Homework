// 12. Copy the elements of one array into another array.

import java.util.Arrays;

public class hmw24oct12 {
    public static void main(String[] args) {

//        var 1
        int[] arr1 = new int[]{ 8, 21, 15, 27, 41, 77};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("The elements of first array are: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("The elements of new array are: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }

//        var 2
//        int[] arr1 = new int[]{7, 10, 9, 8, 12};
//        int[] arr2 = new int[arr1.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//            }
//        System.out.println("The elements of original array are: ");
//        for (int j = 0; j < arr1.length; j++) {
//            System.out.print(arr1[j] + " ");
//        }
//        System.out.println();
//        System.out.println("Elements of new array: ");
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//

    }
}
