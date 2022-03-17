public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(8, -2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);

        int z = calc.pow.apply(-11);
        int w = calc.abs.apply(-5);

        int t = calc.multiply.apply(z, w);

        calc.println.accept(c);
        calc.println.accept(z);
        calc.println.accept(w);
        calc.println.accept(t);
    }
}
