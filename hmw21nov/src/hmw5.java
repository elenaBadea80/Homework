import java.util.ArrayList;
import java.util.List;

//Populate a List<Integer>, then convert each integer to its string representation and store it in a new List<String>.

public class hmw5 {

    public static void main(String[] args) {

        List<Integer> integer = new ArrayList<>();

        integer.add(5);
        integer.add(7);
        integer.add(3);
        integer.add(4);

        System.out.println(integer);

        // Conversie din Integer în String și stocare într-o nouă listă
        List<String> stringList = new ArrayList<>();
        for (Integer number : integer) {
            stringList.add(number.toString());
        }
        // Afișare lista de string-uri
        System.out.println( stringList);
    }
}
