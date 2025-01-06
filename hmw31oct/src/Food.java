// Create 3 classes, with at least 5 fields (use as many types as possible, for example int, boolean, or String),
// each class should have 3 constructors with various combinations of parameters and also a private constructor
// that is being called. Please also create getters and setters for the instance fields and add validations
// on input (for example, price/age should not be negative).
// Use these classes in the main method.

public class Food {

    private String dessert;
    private int price;
    private boolean isDessert;
    private int quantity;
    private String name;

    private Food( String dessert, String name, int price){  // NU TREBUIE SA AIBA ACELASI NR. DE VARIABILE CA UN CONSTRUCTOR PUBLIC
        this.dessert = "dessert";
        this.name = "goodies";
        this.price = 17;
//        System.out.println("This is a " + dessert + "and it's name is " + getName() + " and the price is " + getPrice());
    }
  
    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        isDessert = dessert == "dessert";
        this.dessert = dessert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isDessert() {
        return isDessert;
    }

    public void setDessert(boolean dessert) {
        isDessert = dessert;
    }

    public Food() {
        isDessert = dessert == "dessert";
    }

    public Food(int price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.isDessert = dessert == "desssert";
    }

    public Food(String name, int price, int quantity, String dessert) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.dessert = dessert;
        this.isDessert = dessert == "dessert";
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("It's dessert: " + isDessert);
    }
}