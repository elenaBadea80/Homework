// 9. Use the built-in Consumer<String> functional interface to print strings prefixed with "Hello, ".

import java.util.function.Consumer;

public class Hmw09ian9Consumer {
    public static void main(String[] args) {

        Consumer<String> myConsumer = s -> System.out.println("Hello, " + s);

        String str = "Vlad!";
        myConsumer.accept(str);
    }

}
