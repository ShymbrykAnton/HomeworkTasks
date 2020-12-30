package CharactersAndAndStrings;

public class ConversionFunctions {

    public String getStrFromInt(int number) {
        if (number == 0) {
            return "0";
        }
        int minus = 0;
        if (number < 0) {
            minus = 1;
            number *= -1;
        }
        String resultStr = "";
        int countValueOfNumbers;
        char lastNumber;
        while (number > 0) {
            lastNumber = (char) ((number % 10) + 48);
            number /= 10;
            for (countValueOfNumbers = 0; countValueOfNumbers < 10; countValueOfNumbers++) {
                if ((char) ('0' + countValueOfNumbers) == lastNumber) {
                    resultStr = (char) ('0' + countValueOfNumbers) + resultStr;
                }
            }
        }
        if (minus == 0) {
            return resultStr;
        }
        return "-" + resultStr;
    }

    //вещественного числа в строку
    public String getStrFromDouble(double number) {
        if (number == 0) {
            return "0.0";
        }
        int minus = 0;
        if (number < 0) {
            minus = 1;
            number *= -1;
        }
        String resultStr = "";
        if (minus == 0) {
            return resultStr;
        }
        return "-" + resultStr;
    }

    public int getIntFromStr(String number) {
        if (number.equals("")) {
            return 0;
        }
        int minus = 0;
        if (number.charAt(0) == '-') {
            minus = 1;
        }
        int countNumbers, countValueOfNumbers, resultInt = 0, numberPlace = 1;
        for (countNumbers = number.length() - 1; countNumbers >= 0; countNumbers--) {
            if (countNumbers < number.length() - 1) {
                numberPlace *= 10;
            } else {
                numberPlace *= 1;
            }
            for (countValueOfNumbers = 0; countValueOfNumbers < 10; countValueOfNumbers++) {
                if (number.charAt(countNumbers) == (char) ('0' + countValueOfNumbers)) {
                    resultInt += countValueOfNumbers * numberPlace;
                }
            }
        }
        if (minus == 0) {
            return resultInt;
        } else {
            return resultInt * (-1);
        }
    }

    //строки в вещественное число
    public double getDoubleFromStr(String number) {
        return Double.parseDouble(number);
    }
}
