// 13. Sort a list of integers in descending order using sorted().

import java.util.List;

public class Hmw09ian13Sort {
    public static void main(String[] args) {

        List<Integer> myList = List.of(3, 5, 59, 37, 59, 41, 41, 83);

        List<Integer> sortedList = myList.stream()
                .sorted()
                .toList();

        System.out.println(myList);
        System.out.println(sortedList);
    }
}
