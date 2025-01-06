package holiday;

public class Main{
    public static void main(String[] args) {
        Trips trips1 = new Trips("spring",10,3500);
        Japan japan = new Japan("summer", 15, 4000, "Tokio");
        trips1.printDetails();
        japan.printDetails();
    }
}
