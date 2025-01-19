// 14. Create a list of strings, filter out strings containing the letter "a",
// and collect the remaining strings into a new list.

import java.util.List;

public class Hmw09ian14FilerOut {
    public static void main(String[] args) {

        List<String> myList = List.of("Ana", "sun", "target", "arrow", "door", "sky", "glad");

        List<String> filtredList = myList.stream()
                .filter(s -> s.contains("a"))
                .toList();

        System.out.println(myList);
        System.out.println(filtredList);

    }
}
