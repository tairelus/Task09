package bjs.task09;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setBinary(125.4, 12);
        calc.getSum();
        calc.printResult();

        calc.setUnary(16);
        calc.getSqrt();
        calc.printResult();

        calc.setUnary(Math.PI/2);
        calc.getSin();
        calc.printResult();

        int array[] = {6, 8, 9, 7, 20, 55, 48, 66, 74};

        if (array != null && array.length > 0) {
            System.out.println("Max array value: " + calc.getArrayMax(array));
        }
    }
}
