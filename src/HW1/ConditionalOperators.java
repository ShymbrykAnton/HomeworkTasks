package HW1;

public class ConditionalOperators {
    public String getSumOrMultiply(int a, int b) {
        if (a == 0) {
            return "Число а = 0: 0";
        }
        if (a % 2 == 0) {
            return String.format("Число а - четное: %s", (a * b));
        }
        return String.format("Число а - нечетное: %s", (a + b));
    }

    public String findQuarterByCoordinates(int x, int y) {
        final String formal = "Точка принадлежит следующим(ей) четвертям(и):";
        if (x > 0) {
            if (y > 0) {
                return String.format("%s первой",formal);
            }
            if (y < 0) {
                return String.format("%s четвертой",formal);
            }
        }
        if (x < 0) {
            if (y > 0) {
                return String.format("%s второй",formal);
            }
            if (y < 0) {
                return String.format("%s третьей",formal);
            }
        }
        if (x == 0) {
            if (y > 0) {
                return String.format("%s первой и второй",formal);
            }
            if (y < 0) {
                return String.format("%s третьей и четвертой",formal);
            }
        }
        if (x > 0) {
            return String.format("%s первой и четвертой",formal);
        }
        if (x < 0) {
            return String.format("%s второй и третьей",formal);
        }
        return "Точка лежит в начале координат";
    }

    public int getOnlyPositiveNumberSum(int a, int b, int c) {
        int result = 0;
        if (a >= 0) {
            result += a;
        }
        if (b >= 0) {
            result += b;
        }
        if (c >= 0) {
            result += c;
        }
        return result;
    }

    public int getMaxMultiplyOrSumPlusThree(int a, int b, int c) {
        int multiply = a * b * c;
        int summa = a + b + c;
        if (multiply == summa) {
            return (multiply + 3);
        }
        if (multiply > summa) {
            return (multiply + 3);
        }
        return (summa + 3);
    }

    public String getMarkByRating(int rating) {
        if (rating < 0 || rating > 100) {
            return "Некорректное значение, введите корректное значение в пределах [0-100]";
        }
        String formal = "Ваша оценка по рейтингу: ";
        if (rating <= 19) {
            return formal + "F";
        }
        if (rating <= 39) {
            return formal + "E";
        }
        if (rating <= 59) {
            return formal + "D";
        }
        if (rating <= 74) {
            return formal + "C";
        }
        if (rating <= 89) {
            return formal + "B";
        } else {
            return formal + "A";
        }
    }
}

