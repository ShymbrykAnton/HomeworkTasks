package HW1;

public class Functions {
    final String[] diapason20 = {"", "Один ", "Два ", "Три ", "Четыре ", "Пять ", "Шесть ", "Семь ", "Восемь ", "Девять ",
            "Десять ", "Одиннадцать ", "Двенадцать ", "Тринадцать ", "Четырнадцать ", "Пятнадцать ", "Шестнадцать ",
            "Семнадцать ", "Восемнадцать ", "Девятнадцать "};
    String[] diapason100 = {"", "", "Двадцать ", "Тридцать ", "Сорок ", "Пятьдесят ", "Шестьдесят ", "Семьдесят ",
            "Восемьдесят ", "Девяносто "};
    String[] diapason1000 = {"", "Сто ", "Двести ", "Триста ", "Четыреста ", "Пятьсот ",
            "Шестьсот ", "Семьсот ", "Восемьсот ", "Девятьсот "};
    StringBuilder result = new StringBuilder();

    public String getStringFromNumber(int number) {
        if (number < 0 || number > 999) {
            return "Выход за пределы допустимого диапазона";
        }
        if (number == 0) {
            return "Ноль";
        }
        int secondNumber, thirdNumber, numberInStringArray;
        thirdNumber = number % 10;
        secondNumber = (number % 100);
        if (number > 99) {
            for (numberInStringArray = 1; numberInStringArray < 10; numberInStringArray++) {
                if (numberInStringArray == number / 100) {
                    result.append(diapason1000[numberInStringArray]);
                }
            }
        }
        if (secondNumber > 19) {
            for (numberInStringArray = 2; numberInStringArray < 10; numberInStringArray++) {
                if (numberInStringArray == secondNumber / 10) {
                    result.append(diapason100[numberInStringArray]);
                }
            }
        }

        if (thirdNumber < 20) {
            if (number % 100 < 20) {
                thirdNumber = number % 100;
            }
            for (numberInStringArray = 1; numberInStringArray < 20; numberInStringArray++) {
                if (numberInStringArray == thirdNumber) {
                    result.append(diapason20[numberInStringArray]);
                }
            }
        }
        return (result.toString()).trim();
    }

    public int getNumberFromString(String number) {
        if (number.equalsIgnoreCase("Ноль")) {
            return 0;
        }
        int resultInt = 0, firstNumber, secondNumber, thirdNumber;
        String[] numbers = number.trim().split(" ", 3);
        if (numbers.length == 3) {
            if (!numbers[2].equalsIgnoreCase("")) {
                for (thirdNumber = 1; thirdNumber < 20; thirdNumber++) {
                    if (numbers[2].equalsIgnoreCase(diapason20[thirdNumber].trim())) {
                        resultInt += thirdNumber;
                    }
                }
            }
            if (!numbers[1].equalsIgnoreCase("")) {
                for (secondNumber = 2; secondNumber < 10; secondNumber++) {
                    if (numbers[1].equalsIgnoreCase(diapason100[secondNumber].trim())) {
                        resultInt += secondNumber * 10;
                    }
                }
            }
            if (!numbers[0].equalsIgnoreCase("")) {
                for (firstNumber = 1; firstNumber < 10; firstNumber++) {
                    if (numbers[0].equalsIgnoreCase(diapason1000[firstNumber].trim())) {
                        resultInt += firstNumber * 100;
                    }
                }
            }
            return resultInt;
        }
        if (numbers.length == 2) {
            if (!numbers[1].equalsIgnoreCase("")) {
                for (secondNumber = 1; secondNumber < 20; secondNumber++) {
                    if (numbers[1].equalsIgnoreCase(diapason20[secondNumber].trim())) {
                        resultInt += secondNumber;
                    }
                }
                for (secondNumber = 2; secondNumber < 10; secondNumber++) {
                    if (numbers[1].equalsIgnoreCase(diapason100[secondNumber].trim())) {
                        resultInt += secondNumber * 10;
                    }
                }
            }
            if (!numbers[0].equalsIgnoreCase("")) {
                for (firstNumber = 1; firstNumber < 10; firstNumber++) {
                    if (numbers[0].equalsIgnoreCase(diapason1000[firstNumber].trim())) {
                        resultInt += firstNumber * 100;
                    } else if (numbers[0].equalsIgnoreCase(diapason100[firstNumber].trim())) {
                        resultInt += firstNumber * 10;
                    }
                }
            }
            return resultInt;
        }
        if (numbers.length == 1) {
            if (!numbers[0].equalsIgnoreCase("")) {
                for (firstNumber = 1; firstNumber < 10; firstNumber++) {
                    if (numbers[0].equalsIgnoreCase(diapason1000[firstNumber].trim())) {
                        resultInt = firstNumber * 100;
                    } else if (numbers[0].equalsIgnoreCase(diapason100[firstNumber].trim())) {
                        resultInt = firstNumber * 10;
                    }
                }
                for (secondNumber = 1; secondNumber < 20; secondNumber++) {
                    if (numbers[0].equalsIgnoreCase(diapason20[secondNumber].trim())) {
                        resultInt = secondNumber;
                    }
                }
            }
        }
        return resultInt;
    }
}
