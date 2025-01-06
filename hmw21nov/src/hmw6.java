import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// 6.Create a List<Character> with random alphabet characters. Sort the list ignoring case and display it.

public class hmw6 {
    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>();
        characters.add('s');
        characters.add('e');
        characters.add('B');
        characters.add('W');
        characters.add('a');

        System.out.println(characters);

        List<Character> charactersToLowerCase = new ArrayList<>();
        for (Character characterLower: characters) {
            charactersToLowerCase.add(Character.toLowerCase(characterLower));
        }

        System.out.println(charactersToLowerCase);

        Set<Character> charactersOrder = new TreeSet(charactersToLowerCase);

        System.out.println(charactersOrder);
    }
}
