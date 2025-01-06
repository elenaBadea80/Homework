// Write a Java program to swap two variables

public class hmw03oct7 {
    public static void main(String[] args) {

        int a = 9;
        int b = 5;

        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
