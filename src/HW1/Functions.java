package HW1;

public class Functions {
    final String[] diapason20 = {"", "Один ", "Два ", "Три ", "Четыре ", "Пять ", "Шесть ", "Семь ", "Восемь ", "Девять ",
            "Десять ", "Одинадцать ", "Двенадцать ", "Тренадцать ", "Четырнадцать ", "Пятнадцать ", "Шестнадцать ",
            "Семнадцать ", "Восемнадцать ", "Девятнадцать "};
    String[] diapason100 = {"", "", "Двадцать ", "Тридцать ", "Сорок ", "Пятдесят ", "Шестдесят ", "Семдесят ",
            "Восемдесят ", "Девяносто "};
    String[] diapason1000 = {"", "Сто ", "Двести ", "Триста ", "Четыреста ", "Пятсот ",
            "Шестьсот ", "Семьсот ", "Восемьсот ", "Девятсот "};
    StringBuilder result = new StringBuilder();

    public String getStringFromNumber(int number) {
        if (number < 0 || number > 999) {
            return "Выход за пределы допустимого диапазона";
        }
        if (number == 0) {
            return "Ноль";
        }
        int secondNumber = number, thirdNumber = number, numberInStringArray = 1;
        if (number > 99) {
            for (numberInStringArray = 1; numberInStringArray < 10; numberInStringArray++) {
                if (numberInStringArray == number / 100) {
                    result.append(diapason1000[numberInStringArray]);
                }
            }
            secondNumber = (number % 100);
        }
        if (secondNumber > 19) {
            for (numberInStringArray = 2; numberInStringArray < 10; numberInStringArray++) {
                if (numberInStringArray == secondNumber / 10) {
                    result.append(diapason100[numberInStringArray]);
                }
            }
            thirdNumber = number % 10;
        }
        if (thirdNumber < 20) {
            for (numberInStringArray = 1; numberInStringArray < 20; numberInStringArray++) {
                if (numberInStringArray == thirdNumber) {
                    result.append(diapason20[numberInStringArray]);
                }
            }
        }
        return (result.toString()).trim();
    }
    public int getStringFromNumber(String number) {
//        if (number < 0 || number > 999) {
//            return "Выход за пределы допустимого диапазона";
//        }
//        if (number == 0) {
//            return "Ноль";
//        }

    }
}
//2.	Вводим строку, которая содержит число, написанное прописью (0-999). Получить само число

