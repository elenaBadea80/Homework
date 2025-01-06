package maxElement;

import java.util.Arrays;
import java.util.List;

import static hmw05dec.maxElement.MaxElement.findMax;


public class Main {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(99,54,73,29,18);
        Integer maxNumber = findMax(myList);
        findMax(myList); System.out.println("Numărul maxim: " + (maxNumber != null ? maxNumber : "Colecția este goală"));

        List<String> words = Arrays.asList("măr", "banană", "cireașă");
        String maxWord = findMax(words);
        System.out.println("Cuvântul maxim: " + (maxWord != null ? maxWord : "Colecția este goală"));
    }
}
