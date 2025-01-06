package ocp;

public class RegularDiscount implements DiscountStrategy{

    public double calculateDiscount (double amount){
        return amount * 0.05;
    }

}
