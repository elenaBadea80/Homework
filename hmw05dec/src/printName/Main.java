package printName;

import java.util.Arrays;
import java.util.List;
// 17. Write a generic method printNames(List<? super Animal> list) that accepts any list capable of
// holding Animal objects or their superclasses, and prints their name field.
public class Main {
    // Metoda printNames va accepta o listă generică și
    // va itera prin aceasta pentru a afișa numele fiecărui obiect de tip Animal sau superclasele acestuia.
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Animal("dog"), new Animal("cat"), new Animal("dolphin"));
        printNames(animals);
    }

    public static void printNames(List < ? super Animal> list){

        for (Object o : list){
            if (o instanceof Animal){
                Animal animal = (Animal) o;
                System.out.println(animal.name);
            }
        }
    }
}
