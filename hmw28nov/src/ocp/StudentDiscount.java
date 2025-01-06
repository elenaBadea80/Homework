package ocp;

public class StudentDiscount implements DiscountStrategy{

    public double calculateDiscount (double amount){
        return amount * 0.15;
    }
}
