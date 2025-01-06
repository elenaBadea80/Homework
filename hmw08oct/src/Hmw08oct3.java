//Read three side lengths as integers and determine if they form a valid triangle. If so, specify if it is equilateral, isosceles, or scalene.

import java.util.Scanner;

// var prezentatorului

public class Hmw08oct3 {
    public static void main(String[] args) {

        Scanner Latura1 = new Scanner(System.in);
        System.out.println("Avem trei laturi cu valorile: ");

        System.out.print("Latura a are lungimea: ");
        int a = Latura1.nextInt();

        System.out.print("Latura b are lungimea: ");
        int b = Latura1.nextInt();

        System.out.print("Latura c are lungimea: ");
        int c = Latura1.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Laturile formeaza un triunghi.");
        }

        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("Triunghiul format este isoscel.");
        }

        if (a == b && b == c) {
            System.out.println("Triunghiul format este echilateral.");
        }

        if (a * a == b * b + c * c || b * b == c * c + a * a || c * c == a * a + b * b) {
            System.out.println("Triunghiul format este dreptunghic.");
        }

        Scanner Latura2 = new Scanner(System.in);


        System.out.print("Latura a are lungimea: ");
        int aa = Latura2.nextInt();
        System.out.print("Latura b are lungimea: ");
        int bb = Latura2.nextInt();

        System.out.print("Latura c are lungimea: ");
        int cc = Latura2.nextInt();

        if(aa + bb > cc &&  aa + cc > bb && bb + cc > aa) {
            System.out.println("the triangle is valid");

            if (aa == bb && bb == cc) {
                System.out.println("echilateral");
            } else if (aa == bb || aa == cc || bb == cc) {
                System.out.println("isoscel");
            } else {
                System.out.println("scalene");
            }
        } else {
            System.out.println("invalid");

        }
    }
}


