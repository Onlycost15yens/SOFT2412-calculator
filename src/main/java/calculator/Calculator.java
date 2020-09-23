package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) throws NumberFormatException {
        if (b == 0) throw new NumberFormatException("Cannot divide by 0");
        return a/b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(a, b));
    }
}
