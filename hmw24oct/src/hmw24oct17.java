// 17. Write a program to compare two strings and check if they are equal (case-sensitive and
// case-insensitive).

public class hmw24oct17 {
    public static void main(String[] args) {

        String string1 = "DiSpoZitive";
        String string2 = "dispozitive";

        System.out.println();
        if (string1.equals(string2)) {
            System.out.println(string1 + " equals to " + string2 + ".");
        } else {
            System.out.println(string1 + " is not equals to " + string2 + ".");
        }
        String lowerstring1 = string1.toLowerCase();
        if (lowerstring1.equals(string2)) {
            System.out.println(lowerstring1 + " equals to " + string2 + ".");
        } else {
            System.out.println(lowerstring1 + " is not equals to " + string2 + ".");
        }
    }
}
