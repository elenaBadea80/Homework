// 7. Define a functional interface StringCombiner with a method String combine(String s1, String s2)
// and use a lambda to concatenate two strings with a space in between.

public class Hmw09ian7StringCombiner {
    public static void main(String[] args) {

        StringCombiner myCombiner = (s1, s2) -> s1 + " " + s2;

        String str1 = "Play,";
        String str2 = "again!";
        String concate = myCombiner.combine(str1,str2);

        System.out.println(concate);

    }
}

@FunctionalInterface
interface StringCombiner {
    String combine(String s1, String s2);
}