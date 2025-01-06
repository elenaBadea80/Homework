package holiday;

public class Trips {

    private String season;
    private int price;
    private int days;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Trips (String season, int days, int price){
        this.season = season;
        this.days = days;
        this.price = price;
    }

    public void printDetails(){
        System.out.println("This trip is in " + getSeason() + "in " + " and it lasts " + getDays() + " days" + ". The price is " + getPrice() + " euro.");
    }

}
