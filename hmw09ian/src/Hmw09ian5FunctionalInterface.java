// 5. Define a functional interface Calculator with a method int calculate(int a, int b).
// Use lambdas to implement this interface for: Addition; Subtraction; Multiplication; Division
//Test these implementations with various inputs.

public class Hmw09ian5FunctionalInterface {
    public static void main(String[] args) {

        Calculator add = (a,b) -> a+b;
        Calculator subtr = (a,b) -> a-b;
        Calculator divide = (a,b) -> a/b;
        Calculator multiply = (a,b) -> a*b;

        int sum = add.calculate(7, 8);
        int dif = subtr.calculate( 10,8);
        int div = divide.calculate(21,7);
        int multip = multiply.calculate(3,2);

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(div);
        System.out.println(multip);

        Calculator add1 = (a,b) -> {
            System.out.print("the result is: " );
            return a+b;
        };

        System.out.println(add1.calculate(15,7));
    }
}

@ FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}