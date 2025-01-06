public class MainFood {
    public static void main(String[] args) {

        Food cake = new Food("cake", 25, 30, "dessert");
        cake.printInfo();

        System.out.println("----------------------------------");
        Food pie = new Food(27, 61, "cheescake");
        pie.printInfo();

        System.out.println("----------------------------------");
        Food cake2 = new Food();
        cake2.setName("pancake");
        cake2.setPrice(15);
        cake2.setQuantity(21);
        cake2.setDessert("dessert");
        cake2.printInfo();

        System.out.println("-------------------------------------");
        cake.setName("soup");
        cake.setDessert("soup");
        System.out.println("The new food is: " + cake.getName() + ".");
        cake.printInfo();

        System.out.println("-------------------------------------");
        Food cake3 = new Food();
        System.out.println("This is a " + cake3.getDessert() + " and it's name is: " + cake3.getName() +"." +" It's price is " + cake3.getPrice() + " and we need " + cake3.getQuantity() + " piecies."  );

    }
}
