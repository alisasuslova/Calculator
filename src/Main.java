public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        try {
            int b = calc.minus.apply(1, 1); // now b = 0, late will be ArithmeticException - "/ by zero".
            // make second parameter != first parameter, make y > x || y < x to fix this, or use try-catch.
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);

        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль! Измените параметр у. y не должен быть равен x");
        }
    }
}
