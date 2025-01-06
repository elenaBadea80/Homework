// 21. Write methods to calculate the area of a circle, rectangle, and triangle.
// Call these methods in the main program to compute areas for different inputs.

import java.util.Scanner;

public class hmw24oct21 {

    public static double areaCircle(double radius) {

        double areaC = radius * radius * Math.PI;
        return areaC;
    }

    public static int areaRectangle(int length, int width) {

        int areaR = length * width;
        return areaR;
    }

    public static int areaTriangle(int heigth, int side) {

        int areaT = (heigth * side) / 2;
        return areaT;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int i;
        do {
            System.out.print("Enter a positive number and bigger than zero for radius r: ");
            i = scanner.nextInt();
        } while (!(i > 0)); // functioneaza si daca scriem while ( i <= 0 )

        System.out.print("The area of the circle is = " + areaCircle(i) + ".\n");

        System.out.println();
        int a, b;
        do {
            System.out.print("Enter a positive number and bigger than zero for the length of the rectangle: ");
            a = scanner.nextInt();
        } while (!(a > 0));
        do {
            System.out.print("Enter a positive number and bigger than zero for the width of the rectangle: ");
            b = scanner.nextInt();
        } while (!(b > 0));

        System.out.print("The area of the rectangle is = " + areaRectangle(a, b) + ".\n");

        System.out.println();
        int h, k;
        do {
            System.out.print("Enter a positive number and bigger than zero for the height of the triangle: ");
            h = scanner.nextInt();
        } while (!(h > 0));
        do {
            System.out.print("Enter a positive number and bigger than zero for the side of the triangle: ");
            k = scanner.nextInt();
        } while (!(k > 0));

        System.out.println("The area of the triangle is " + areaTriangle(h, k) + ".\n");
    }
}


