package container;

public class Main {
    public static void main(String[] args) {

        Container <Integer> myContainer = new Container<>();
        myContainer.add(2);
        myContainer.add(5);
        myContainer.add(6);

        System.out.println(myContainer.sum());

    }
}
