package enumCofeeSize;
// 9. Create an enum CoffeeSize with sizes and attributes like volume and price.
// Implement a method to calculate the cost of an order.
public enum CofeeSize {

    SMALL(150, 6),
    MEDIUN(250, 9),
    LARGE(350, 12);

    private final int volume;
    private final double price;

    CofeeSize(int volume, double price){
        this.volume = volume;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume(){
        return volume;
    }

    public static double orderCost(CofeeSize size, int quantaty){
        return size.getPrice() * quantaty;

    }
}
