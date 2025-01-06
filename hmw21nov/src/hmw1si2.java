// 1.Create a List<Integer> and populate it with random integers. Sort the list in ascending and descending order.
// 2.Take a sentence as input, split it into words, and store the words in a List<String>. Remove duplicate words
// and display the list in alphabetical order.

import java.util.*;

public class hmw1si2 {
    public static void main(String[] args) {

        List<Integer> tripPrice = new ArrayList<>(7);

        tripPrice.add(670);
        tripPrice.add(430);
        tripPrice.add(520);
        tripPrice.add(740);
        tripPrice.add(430);
        tripPrice.add(280);

        System.out.println(tripPrice);

        for (Integer value : tripPrice) {
            System.out.println(value);
        }
        System.out.println("------------------------------");
        Set<Integer> ascOrder = new TreeSet<>(tripPrice);
        System.out.println(ascOrder);

        for (Integer ascOrderValue : ascOrder) {
            System.out.println(ascOrderValue);
        }
        System.out.println("---------------------------------");

        List<Integer> tripPriceReverse = new ArrayList<>(ascOrder);
        Collections.sort(tripPriceReverse, Collections.reverseOrder());
        System.out.println(tripPriceReverse);
        for (Integer descOrderValue : tripPriceReverse) {
            System.out.println(descOrderValue);
        }

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine(); // "I ordered a soup, then I ordered a steak and pancakes."

        String sentenceToLowerCase = sentence.toLowerCase();
        String[] sentenceToLowerCaseSplit = sentenceToLowerCase.split(" ");

        List<String> sentenceList = Arrays.asList(sentenceToLowerCaseSplit);
        System.out.println(sentenceList);

        Set<String> removeDuplicates = new TreeSet<>(sentenceList);
//        for (String removeDuplicate : removeDuplicates) {
//        System.out.println(removeDuplicate);
        System.out.println(removeDuplicates);
//        }



    }

}

