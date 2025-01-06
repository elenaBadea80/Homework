public class MainHolidays {
    public static void main(String[] args) {

        Holidays trip1 = new Holidays(2400, "Israel", 3500, 37);
        System.out.println();
        trip1.printInfo();
        System.out.println("--------------------------------");

        Holidays trip2 = new Holidays("Maramures", 700);
        trip2.printInfo();

        System.out.println("--------------------------------------");
        Holidays trip3 = new Holidays();
        trip3.setDistance(1200);
        trip3.setLocation("Athens");
        trip3.setPrice(2100);
        trip3.setSeats(53);
        trip3.printInfo();

        System.out.println("---------------------------------------");
        trip1.setLocation("Budapesta");
        trip1.setDistance(850);
        trip1.setPrice(1000);
        trip1.printInfo();
    }
}
