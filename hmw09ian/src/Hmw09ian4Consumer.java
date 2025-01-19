// 4. Print all elements of a list using Consumer<String> and a lambda expression.

import java.util.List;
import java.util.function.Consumer;

public class Hmw09ian4Consumer {

    public static void main(String[] args) {

        List<String> countries = List.of("Japan", "Tibet", "Nepal", "Norway");

        Consumer<String> printCountries = country -> System.out.println(country);

        countries.forEach(printCountries);

    }
}
