// 17. Create a class Person with name and age fields. From a list of persons,
// find the oldest person using max().

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Hmw09ian17MaxList {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Person 1", 23),
                new Person("Person 2", 36),
                new Person("Person 3", 28),
                new Person("Person 3", 47),
                new Person("Person 5", 51),
                new Person("Person 6", 51)
        );

        int maxAge = personList.stream()
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getAge)
                .orElse(0);

        List<Person> person = personList.stream()
                .filter(n -> n.getAge() == maxAge)
                .toList();

        person.forEach(System.out::println);
    }

}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}