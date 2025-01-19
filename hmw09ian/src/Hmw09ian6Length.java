// 6. Use a lambda expression with Function<String, Integer> to find the length of a string.

import java.util.function.Function;

public class Hmw09ian6Length {
    public static void main(String[] args) {

        Function<String, Integer> stringLength = s -> s.length();

        String mystring = "Stop playing with that!";
        int lenght = stringLength.apply(mystring);

        System.out.println(lenght);
    }
}
