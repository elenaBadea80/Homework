package box;

public class Main {

    public static void main(String[] args) {

        Box thisBox = new Box<>("book1");
        Box thatBox = new Box<>("23");

        Box thisBox1 = thisBox;

        Object thisBoxContent = thisBox.getBoxContent();
        Object thisBoxContent1 = thisBox1.getBoxContent();
        System.out.println(thisBoxContent);
        System.out.println(thisBoxContent1);

        Object thatBoxBoxContent = thatBox.getBoxContent();
        System.out.println(thatBoxBoxContent);

        thisBox1.clearBoxContent();
        Object clearThisBox1 = thisBox1.getBoxContent();
        System.out.println(clearThisBox1);

    }
}
