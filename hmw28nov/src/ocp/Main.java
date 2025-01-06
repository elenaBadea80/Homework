
package ocp;

/**
 * Refactor the DiscountCalculator class to follow OCP using interfaces or abstract classes.
 * Add a new customer type (e.g., "Student") without modifying the existing logic.
 */
public class Main {

    public static void main(String[] args) {

        DiscountCalculator regularClient = new DiscountCalculator(new RegularDiscount());
        System.out.println("Regular discount is: " + regularClient.calculateDiscount(400) );

        DiscountCalculator vipClient = new DiscountCalculator(new VipDiscount());
        System.out.println("Vip discount is: " + vipClient.calculateDiscount(600));

        DiscountCalculator studentClient = new DiscountCalculator(new StudentDiscount());
        System.out.println("Student discount is: " + studentClient.calculateDiscount(200));

    }

}
