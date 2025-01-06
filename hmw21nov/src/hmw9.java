// 9. Create a TreeSet<String> and add various city names.
// Display the cities in alphabetical order. Then try to display them in reverse alphabetical order.

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class hmw9 {

    public static void main(String[] args) {

        Set<String> cities = new TreeSet<>();

        cities.add("Tokio");
        cities.add("London");
        cities.add("Athens");
        cities.add("Lhasa");
        cities.add("Sydney");
        cities.add("Beijing");

        System.out.println(cities);

        Set<String> reverseCities = new TreeSet<>(Collections.reverseOrder());
        reverseCities.addAll(cities);

        System.out.println(reverseCities);
    }
}
