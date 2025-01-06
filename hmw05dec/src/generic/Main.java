package generic;

public class Main {
    public static void main(String[] args) {

        Pair studentPair1 = new Pair<>("Bob Star", 9);
        Pair studentPair2 = new Pair<>("Anne Mayr", 9.5);

        studentPair1.printDetail();
        studentPair2.printDetail();

    }
}
