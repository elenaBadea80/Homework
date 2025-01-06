package maxElement;

import java.util.Collection;

// 17. Implement a generic method findMax(Collection<? extends Comparable<T>> collection) that returns the maximum element from a collection.
public class MaxElement {
    public static <T extends Comparable<T>> T findMax(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        T max = null;
        for (T element : collection) {
            if (max == null || element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}