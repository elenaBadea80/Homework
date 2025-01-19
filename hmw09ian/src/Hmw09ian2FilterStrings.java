// 2. Filter a list of strings to only include those starting with "A" using a lambda expression.

import java.util.List;

public class Hmw09ian2FilterStrings {

    public static void main(String[] args) {

        List<String> names = List.of("Ana", "Maria", "Andrei", "Legolas", "Alex", "Lhea");

        List<String> filtredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println("Filtered names: " + filtredNames);
    }
}
