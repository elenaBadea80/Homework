// 23. Write two methods: one that finds the minimum and another that finds the
// maximum value in an array of integers.

public class hmw24oct23 {

    public static int maxValue (int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++){
          if(a[i] > max ) {
              max = a[i];
          }}
    return max;
    }

    public static int minValue (int[] b){
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] < min){
                min = b[i];
            }}
        return min;
        }

    public static void main(String[] args) {

        int[] arr = {57, 89, 123, 45, 1, 28, 103};

        System.out.println();
        System.out.println("The max value of the array is " + maxValue(arr) + ".");
        System.out.println("The min value of the array is " + minValue(arr) + ".");

    }
}
