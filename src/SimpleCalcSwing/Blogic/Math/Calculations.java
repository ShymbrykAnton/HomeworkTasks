package SimpleCalcSwing.Blogic.Math;

import static SimpleCalcSwing.Utils.Constants.ErrorText.DIVISION_ON_0;

public class Calculations {
    public double getSum(double number1, double number2) {
        return number1 + number2;
    }

    public double getDifference(double number1, double number2) {
        return number1 - number2;
    }

    public double getMultiply(double number1, double number2) {
        return number1 * number2;
    }

    public double getDivision(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException(DIVISION_ON_0);
        }
        return number1 / number2;
    }

    public double getRoot(double number1, double number2) {
        return Math.pow(number1, 1 / number2);
    }

    public double getPow(double number1, double number2) {
        return Math.pow(number1, number2);
    }
}