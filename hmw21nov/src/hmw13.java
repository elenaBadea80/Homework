// 13.Create two Set<Integer> objects with some common elements.
// Write methods to find the union, intersection, and difference of these sets.

import java.util.HashSet;
import java.util.Set;

public class hmw13 {
    public static void main(String[] args) {

        Set<Integer> object1 = new HashSet<>();
        Set<Integer> object2 = new HashSet<>();

        object1.add(11);
        object1.add(77);
        object1.add(11);
        object1.add(44);
        object1.add(369);

        object2.add(77);
        object2.add(369);
        object2.add(11);
        object2.add(88);
        object2.add(23);
        object2.add(88);

        System.out.println(" ");
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(" ");

        Set<Integer> unionSet = union(object1, object2);
        System.out.println("Union " + unionSet);

        Set<Integer> intersaction = intersection(object1, object2);
        System.out.println("Intersaction " + intersaction);

        Set<Integer> difference = difference(object1, object2);
        System.out.println("Difference " + difference);
    }

    public static Set<Integer> union(Set<Integer> object1, Set<Integer> object2) {
        Set<Integer> unionSet = new HashSet<>(object1);
        unionSet.addAll(object2);
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> object1, Set<Integer> object2) {
        Set<Integer> intersectionSet = new HashSet<>(object1);
        intersectionSet.retainAll(object2);
        return intersectionSet;
    }

    public static Set<Integer> difference(Set<Integer> object1, Set<Integer> object2) {
        Set<Integer> differenceSet = new HashSet<>(object1);
        differenceSet.removeAll(object2);
        return differenceSet;
    }
}
