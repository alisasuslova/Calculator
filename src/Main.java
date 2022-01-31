public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);
        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);

        System.out.println(calc.devide(5, 0));

        int d = calc.multiply.apply(2, 10);
        calc.println.accept(d);

        int e = calc.pow.apply(4);
        calc.println.accept(e);

        int f = calc.abs.apply(-10);
        calc.println.accept(f);

        System.out.println(calc.isPositive.test(5));

    }
}
