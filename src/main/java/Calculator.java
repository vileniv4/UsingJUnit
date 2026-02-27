import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = () -> {
        Calculator calculator = new Calculator();
        return calculator;
    };
    /**
     * сложение
     */
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    /**
     * вычитание
     */
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    /**
     * умножение
     */
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    /**
     * деление
     */
    BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0) {
            throw new RuntimeException("На ноль делить нельзя.");
        }
        return (int) ((double) x / y);
    };
    /**
     * возведение в квадрат
     */
    UnaryOperator<Integer> pow = x -> x * x;
    /**
     * модуль от числа
     */
    UnaryOperator<Integer> module = x -> x > 0 ? x : x * -1;
    /**
     * определение положительное ли число
     */
    Predicate<Integer> isPositive = x -> x > 0;
    /**
     * вывод числа в консоль
     */
    Consumer<Integer> println = System.out::println;
}
