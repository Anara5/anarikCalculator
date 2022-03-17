import java.util.function.*;

public class Calculator {

    //Constructor
    public Calculator() {
    }

    static Supplier<Calculator> instance = Calculator::new;

    // operating
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    /**
     * here we need an ArithmeticException because we can't divide by 0
     * one of solutions for this case is to return 0 if we use a BinaryOperator<Integer>
     */
    BinaryOperator<Integer> divide = (x, y) -> y == 0 ? 0 : x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
