// 10. Define a functional interface Transformer<T> with a method T transform(T input) and use a lambda to reverse a string.


public class Hmw09ian10Transformer {
    public static void main(String[] args) {

        Transformer<String> myTransform = s -> new StringBuilder(s).reverse().toString();

        String str = "The cat said mom!";
        String strRevers = myTransform.transform(str);
        System.out.println(str);
        System.out.println(strRevers);
    }
}
@FunctionalInterface
interface Transformer<T>{
    T transform(T input);
}