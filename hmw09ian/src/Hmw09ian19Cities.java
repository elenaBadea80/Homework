// 19. Create a list of cities and sort them alphabetically in reverse order using streams.

import java.util.Comparator;
import java.util.List;

public class Hmw09ian19Cities {
    public static void main(String[] args) {

        List<String> cities = List.of("Tokio", "London", "Alba-Iulia", "New York", "Barcelona", "Rome", "Edirne");

        List<String> orderedCities = cities.stream()
                .sorted(Comparator.reverseOrder()) // sau .sorted((city1, city2) -> city2.compareTo(city1))
                .toList();
        List<String> alphCities = cities.stream()
                .sorted(String::compareTo)  // sau // sau .sorted((city1, city2) -> city1.compareTo(city2))
                .toList();

        System.out.println(alphCities);
        System.out.println(orderedCities);
    }
}
