package listUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = List.of(11,73,-2,31,47,5,-16,99);
        int count = ListUtils.countGreaterThan(intList,20);
        System.out.println("Numarul elementelor mai mari decat 20: " + count );
    }
}
