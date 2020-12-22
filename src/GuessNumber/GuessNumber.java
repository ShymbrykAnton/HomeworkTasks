package GuessNumber;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int randomValue;
    int tryingGuess;
    String userCommand;
    int tryNumber;
    int min;
    int max;

    public GuessNumber(int tryNumber, int min, int max) {
        this.tryNumber = tryNumber;
        this.min = min;
        this.max = max;
    }


    public void start() {
        if (min > 200 || min < 1) {
            System.out.println("Задано некоректное значение начала диапазона (Коректное: от 1 до 200)");
            System.exit(0);
        }
        if (max < min || max > 200) {
            System.out.println("Задано некоректное значение конца диапазона (Коректное: от начала диапазона до 200)");
            System.exit(0);
        }
        if (tryNumber < 1 || tryNumber > 15) {
            System.out.println("Задано некоректное значение количества возможных попыток (Коректное: от 1 до 15)");
            System.exit(0);
        }
        System.out.println("Привет, я загадал число от " + min + " до " + max + ". Попробуй угадать его за " + tryNumber + " попыток! Удачи)");
        generateNumber();
    }

    public void generateNumber() {
        randomValue = random.nextInt((max - min) + 1) + min;
        // не забыть убрать
        System.out.println(randomValue);
        System.out.println("Число было сгенерировано. В любой момент при вводе комманды \"exit\" программа завершит свою работу ");
        guessNumber();
    }

    public void guessNumber() {
        for (int tryCounter = 0; tryCounter < tryNumber; tryCounter++) {
            try {
                tryingGuess = scanner.nextInt();
            } catch (InputMismatchException exception) {
                userCommand = scanner.nextLine();
                if (userCommand.equalsIgnoreCase("exit")) {
                    exit();
                } else {
                    System.out.println("Некоректная комманда");
                    guessNumber();
                }
            }
            if (tryingGuess == randomValue) {
                System.out.println("Поздравляю, вы угадали число за " + (tryCounter + 1) + " попыток");
                break;
            }
            if (tryCounter == 0 ) {
                System.out.println("Не угадал, попробуй ещё");
            }
            if (tryCounter >= 1) {
                if (tryingGuess >= randomValue - 5 && tryingGuess <= randomValue + 5) {
                    System.out.println("Не угадал, но было жарко");
                } else if (tryingGuess >= randomValue - 15 && tryingGuess <= randomValue + 15) {
                    System.out.println("Не угадал, но было тепло");
                } else if (tryingGuess <= randomValue - 16 || tryingGuess >= randomValue + 16) {
                    System.out.println("Холодно, не угадал");
                }
            }
            if (tryCounter == tryNumber - 1) {
                System.out.println("Колличество попыток закончилось");
            }
        }
        exit();
    }

    public void exit() {
        // при конце попыток дважды выводит надписи екзита
        System.out.println("Вы хотите завершить роботу программы? Yes (выход) / No (перезапуск программы)");
        scanner.nextLine();
        userCommand = scanner.nextLine();
        userCommand = userCommand.toLowerCase(Locale.ROOT);
        switch (userCommand) {
            case "yes":
                System.out.println("Надеюсь вы ещё вернетесь)");
                System.exit(0);
                break;
            case "no":
                System.out.println("Выполнен перезапуск программы\n");
                start();
                break;
            default:
                System.out.println("Комманда была введена неправильно, попробуйте ещё раз");
                exit();
                break;
        }
    }

}