// 16. Write a program to count the number of characters (excluding spaces) in a string.

public class hmw24oct16 {
    public static void main(String[] args) {

        String string = " shopping ";
        String untrimstring = string.trim();
        int count = 0;
        for (int i = 0; i < untrimstring.length(); i++) {
            count++;
        }
        System.out.println(string);
        System.out.println(untrimstring);
        System.out.println(count);

    }
}
