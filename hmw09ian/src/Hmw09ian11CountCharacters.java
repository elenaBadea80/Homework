// 11. Count the number of strings in a list that are longer than 5 characters.

import java.util.List;

public class Hmw09ian11CountCharacters {
    public static void main(String[] args) {

        List<String> myList = List.of("pillow", "chair", "moovie", "deer", "sky", "travel");

        long count = myList.stream()
                .filter(s -> s.length() > 5)
                .count();

        System.out.println(count);
    }
}
