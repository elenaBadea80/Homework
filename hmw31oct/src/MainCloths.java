public class MainCloths {

    public static void main(String[] args) {

        Cloths Tshirt = new Cloths(25, "winter", 38, 300, "women");
        System.out.println();
        Tshirt.printInfo();

        System.out.println("----------------------------------");
        Cloths dress = new Cloths(38, 36);
        dress.printInfo();

        System.out.println("----------------------------------");
        Cloths skirt = new Cloths();
        skirt.setAge(36);
        skirt.setSize(34);
        skirt.setWomen("women");
        skirt.setPrice(421);
        skirt.setSeason("spring");
        skirt.printInfo();

        System.out.println("----------------------------------");
        Tshirt.setPrice(546);
        Tshirt.setWomen("men");
        Tshirt.printInfo();
        System.out.println("The new price for this dress is: " + Tshirt.getPrice() + ".");

    }
}
