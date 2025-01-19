// 12. Create a list of unique integers (remove duplicates) from an existing list using distinct().

import java.util.List;

public class Hmw09ian12Unique {
    public static void main(String[] args) {

        List<Integer> myList = List.of(3, 5, 59, 37, 59, 41, 41, 83);

        List<Integer> withoutDuplicates = myList.stream()
                .distinct()
                .toList();

        System.out.println(myList);
        System.out.println(withoutDuplicates);

    }
}
