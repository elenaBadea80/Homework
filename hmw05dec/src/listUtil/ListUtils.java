package listUtil;

import java.util.List;

// Create a generic class ListUtils with a method countGreaterThan(List<T> list, T element)
// that counts how many elements in the list are greater than the given element.
public class ListUtils {

    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
