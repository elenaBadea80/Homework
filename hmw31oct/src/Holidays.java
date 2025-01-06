// Create 3 classes, with at least 5 fields (use as many types as possible, for example int, boolean, or String),
// each class should have 3 constructors with various combinations of parameters and also a private constructor
// that is being called. Please also create getters and setters for the instance fields and add validations
// on input (for example, price/age should not be negative).
// Use these classes in the main method.

public class Holidays {

    private int price;
    private int seats;
    private String location;
    private int distance;
    private boolean isFarAway;

//    private Holidays(){
//  }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        if (distance < 0) {
            return;
        }
        isFarAway = distance >= 1000;
        this.distance = distance;
    }

    public boolean isFarAway(boolean distance) {
        return isFarAway;
    }

    public void setFarAway(boolean distance) {
        isFarAway = distance;
    }

    public Holidays(int distance, String location, int price, int seats) {
        this.distance = distance;
        this.isFarAway = distance >= 1000;
        this.location = location;
        this.price = price;
        this.seats = seats;
    }

    public Holidays(String location, int price) {
        this.location = location;
        this.price = price;
        this.distance = 580;
        this.isFarAway = distance >= 1000;
        this.seats = 57;
    }

    public Holidays() {
        this.isFarAway = distance >= 0;
    }

    public void printInfo() {
        if (isFarAway) {
            System.out.println("The location for this trip is far away: " + getLocation() + ".");
            System.out.println("Distance in km: " + getDistance() + ";");
            System.out.println("Price in euro: " + getPrice() + ";");
            System.out.println("Seats: " + getSeats() + ";");
            System.out.println();
        } else {
            System.out.println("The location for this trip is not far away: " + getLocation() + ".");
            System.out.println("Distance in km: " + getDistance() + ";");
            System.out.println("Price in euro: " + getPrice() + ";");
            System.out.println("Seats: " + getSeats() + ";");
            System.out.println();
        }
    }
}
