package Calculator;

public class ArithmeticCalculator {
    double first;
    double second;



    public ArithmeticCalculator(double first, double second) {
        this.first = first;
        this.second = second;

    }

    public void calculate(Operations operations){
        if (operations == Operations.ADD){
            System.out.println(first + second);
        } else if (operations == Operations.SUBTRACT){
            System.out.println(first - second);
        } else if (operations == Operations.MULTIPLY) {
            System.out.println(first * second);
        } else
            System.out.println("Zalupa!");


    }


}
