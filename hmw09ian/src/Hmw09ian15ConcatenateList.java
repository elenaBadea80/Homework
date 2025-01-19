// 15. Concatenate all strings in a list into a single string, separated by commas.

import java.util.List;
import java.util.stream.Collectors;

public class Hmw09ian15ConcatenateList {
    public static void main(String[] args) {

        List<String> myList = List.of("Ana", "sun", "target", "arrow", "door", "sky", "glad");

        String concateList = myList.stream()
                .collect(Collectors.joining(", "));

        System.out.println(concateList);
    }
}
