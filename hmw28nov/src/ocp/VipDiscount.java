package ocp;

public class VipDiscount implements DiscountStrategy{

    public double calculateDiscount(double amount){
        return amount * 0.1;
    }

}

