public class hmw1Trip {

    private final String destination;
    private final Double price;

    public hmw1Trip(String destination, Double price){
        this.destination = destination;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }
}
