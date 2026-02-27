public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 3);
        int b = calc.minus.apply(9, 7);
        int m = calc.multiply.apply(5, 4);

        double d = 0;
        try {
            d = calc.divide.apply(12, 6);
        } catch (Exception e) {
            System.out.printf("Ошибка при делении: \"%s\"", e.getMessage());
        }

        int k = calc.pow.apply(6);

        int x = calc.module.apply(-8);

        boolean isPositive = calc.isPositive.test(24);

        System.out.print("2 plus 3 = ");
        calc.println.accept(a);
        System.out.print("9 minus 7 = ");
        calc.println.accept(b);
        System.out.print("5 multiply 4 = ");
        calc.println.accept(m);
        System.out.println("12 divide 6 = " + d);
        System.out.print("6 pow = ");
        calc.println.accept(k);
        System.out.print("-8 module = ");
        calc.println.accept(x);
        System.out.println(-13 + " положительное число? Ответ: " + isPositive);

    }
}
