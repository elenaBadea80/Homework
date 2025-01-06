// Create 3 classes, with at least 5 fields (use as many types as possible, for example int, boolean, or String),
// each class should have 3 constructors with various combinations of parameters and also a private constructor
// that is being called. Please also create getters and setters for the instance fields and add validations
// on input (for example, price/age should not be negative).
// Use these classes in the main method.

public class Cloths {

    private String season;
    private int age;
    private boolean isWomen;
    private String women;
    private int size;
    private int price;

//    private Cloths(){
//    this.}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWomen() {
        return isWomen;
    }

    public void setWomen(boolean women) {
        isWomen = women;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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

    public String getWomen() {
        return women;
    }

    public void setWomen(String women) {
        isWomen = women == "women";
        this.women = women;
    }

    public Cloths(int age, String season, int size, int price, String women) {
        this.season = season;
        this.age = age;
        this.size = size;
        this.price = price;
        this.women = women;
        this.isWomen = women == "women";
    }

    public Cloths(int age, int size) {
        this.size = size;
        this.age = age;
        this.season = "summer";
        this.women = "women";
        this.isWomen = women == "women";
        this.price = 275;
    }

    public Cloths() {
        this.isWomen = women == "women";
    }

    public void printInfo() {

        System.out.println("Season: " + season);
        System.out.println("Age: " + age);
        System.out.println("Is women: " + isWomen);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);

    }
}