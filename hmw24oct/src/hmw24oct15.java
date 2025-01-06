// 15. Create a program that reverses a string without using the built-in reverse function.

public class hmw24oct15 {
    public static void main(String[] args) {

        String[] str1 = new String[]{"a", "h", "e", "h", "t", "w"};
        String[] str2 = new String[str1.length];

        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[i];
        }
        System.out.println();
        System.out.println("The elements of original array are: ");
        for (String j : str1)
            System.out.print(j + " ");

        // sau
//        for (int j = 0; j < str1.length; j++) {
//            System.out.print(str1[j] + " ");
//        }

        System.out.println();
        System.out.println("Elements of new array: ");
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str2[i] + " ");
        }
        System.out.println();
    }
}
