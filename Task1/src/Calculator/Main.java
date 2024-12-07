package Calculator;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator cal = new ArithmeticCalculator(5, 8);
        cal.calculate(Operations.MULTIPLY);

    }
}