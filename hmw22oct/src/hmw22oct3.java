
// 3. Perform various string manipulations using methods. (count vowels and reverse string);

public class hmw22oct3 {

    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return  (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }

    public static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i)))
            ++count;
        return count;
    }

    public static String reverseVowel(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseVowel(str.substring(1)) + str.charAt(0);

    }
    public static void main(String args[]) {

        String str = "limitele lui microsoft";
        System.out.println(countVowel(str));
        System.out.println(reverseVowel(str));
    }
}
