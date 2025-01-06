package enumCofeeSize;

public class Main {
    public static void main(String[] args) {

        double totalCost1 = CofeeSize.orderCost(CofeeSize.SMALL,2);
        double totalCost2 = CofeeSize.orderCost(CofeeSize.MEDIUN, 2);

        System.out.println(totalCost1 + totalCost2);
    }
}
