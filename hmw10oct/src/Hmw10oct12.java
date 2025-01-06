// 12. Initialize an array of double numbers representing prices. Using a while loop, sum all
// the prices until a price greater than 100 is encountered, then stop and display the sum up to that point.

import java.util.Scanner;

public class Hmw10oct12 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int[] price = {23,  17, 31, 47, 77, 100, 18, 67};

        int sum = 0;

//        varianta care calculeaza suma tuturor numerelor
//        for (int i = 0; i < price.length; i++) {
//            sum = sum + price[i];
//            System.out.println("The sum is now: " + sum);
//        }

       // varianta calculeaza suma numerelor, mai putin valorile peste 100
        for (int i = 0; i < price.length; i++) {
            if (price[i] < 100) {
                sum = sum + price[i];
                System.out.println("Suma:" + sum);
            } else {
                break;
            }
        }

        // varianta incorecta
//        int i = price[0];
//        while (price[i] < 100) {
//            System.out.println("dasd:" + sum);
//            sum = sum + price[i];
//
//        }
    }
}


//  NEFINALIZAT