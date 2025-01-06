package holiday;

public class Japan extends Trips {
    private String destination ;
    public Japan (String season, int days, int price, String destination) {
        super(season, days, price);
        this.destination = destination;

    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.print("The city is " + destination + ".");
    }

}

