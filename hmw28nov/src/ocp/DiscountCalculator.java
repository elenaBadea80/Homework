
package ocp;

public class DiscountCalculator {

    private DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount (double amount){
        return discountStrategy.calculateDiscount(amount);
    }



// var initiala corectata:
//    public double calculateDiscount(String customerType, double price) {
//        if (customerType.equals("Regular")) {
//            return price * 0.05;
//        } else if (customerType.equals("VIP")) {
//            return price * 0.1;
//        }
//        return 0;
//    }

}
