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

    public String getStrFromDouble(double number) {
        int minus = 0;
        if (number < 0) {
            minus = 1;
            number *= -1;
        }
        int numberInt, numberDoubleToInt;
        numberInt = (int) number;
        numberDoubleToInt = (int) (((number - numberInt) * 1000000) + 0.000001);
        for (int countZeroAndDelete = 0; countZeroAndDelete < 10; countZeroAndDelete++) {
            if (numberDoubleToInt % 10 == 0) {
                numberDoubleToInt /= 10;
            } else {
                break;
            }
        }
        String resultStr = "";
        if (numberInt == 0) {
            resultStr = "0";
        }
        String resultDoubleStr = "";
        if (numberDoubleToInt == 0) {
            resultDoubleStr = "0";
        }
        resultStr = getStringFromDouble(numberInt, resultStr);
        resultDoubleStr = getStringFromDouble(numberDoubleToInt, resultDoubleStr);
        if (minus == 0) {
            return resultStr + "." + resultDoubleStr;
        }
        return "-" + resultStr + "." + resultDoubleStr;
    }

    private String getStringFromDouble(int numberDoubleToInt, String resultString) {
        int lastNumber;
        int countOfValueNumbers;
        while (numberDoubleToInt != 0) {
            lastNumber = (char) ((numberDoubleToInt % 10) + 48);
            numberDoubleToInt /= 10;
            for (countOfValueNumbers = 0; countOfValueNumbers < 10; countOfValueNumbers++) {
                if ((char) ('0' + countOfValueNumbers) == lastNumber) {
                    resultString = (char) ('0' + countOfValueNumbers) + resultString;
                }
            }
        }
        return resultString;
    }

    public int getIntFromStr(String number) {
        if (number.equals("") || number.equals("0")) {
            return 0;
        }
        int minus = 0;
        if (number.charAt(0) == '-') {
            minus = 1;
        }
        if (minus == 0) {
            return getIntFromString(number);
        } else {
            return getIntFromString(number) * (-1);
        }
    }

    private int getIntFromString(String number) {
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
        return resultInt;
    }

    public double getDoubleFromStr(String number) {
        if (number.equals("") || number.equals("0.0")) {
            return 0.0;
        }
        int minus = 0;
        if (number.charAt(0) == '-') {
            minus = 1;
        }
        int indexOfDot;
        for (indexOfDot = 0; indexOfDot < number.length(); indexOfDot++) {
            if (number.charAt(indexOfDot) == '.') {
                break;
            }
        }
        String afterDot, beforeDot;
        if (number.startsWith(".", indexOfDot)) {
            afterDot = number.substring(indexOfDot + 1);
            beforeDot = number.substring(0, indexOfDot);
        } else {
            beforeDot = number;
            afterDot = "";
        }
        int countNumbers, countValueOfNumbers;
        double resultDoubleBefore = getIntFromString(beforeDot), resultDoubleAfter = 0, numberPlace = 1;
        for (countNumbers = afterDot.length() - 1; countNumbers >= 0; countNumbers--) {
            if (countNumbers < afterDot.length() - 1) {
                numberPlace *= 10;
            } else {
                numberPlace = 1;
            }
            for (countValueOfNumbers = 0; countValueOfNumbers < 10; countValueOfNumbers++) {
                if (afterDot.charAt(countNumbers) == (char) ('0' + countValueOfNumbers)) {
                    resultDoubleAfter += countValueOfNumbers * numberPlace;
                }
            }
        }
        resultDoubleAfter /= Math.pow(10, afterDot.length());
        if (minus == 0) {
            return resultDoubleBefore + resultDoubleAfter;
        } else {
            return (resultDoubleBefore + resultDoubleAfter) * (-1);
        }
    }
}
