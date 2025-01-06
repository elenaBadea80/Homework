// Write a program that calculates various statistics for an array of integers. (find max, min, and average);

public class hmw22oct2 {
    public static void main(String[] args) {

    int[] a = {8, 13, 10, 37, 25, 7, 3, 137};

        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(average(a));
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static int min( int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
    return min;
    }

    public static int average ( int[] a) {
        int sum = 0;
        int avrg;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];}
           avrg = sum / a.length;
        return avrg;
    }
}

