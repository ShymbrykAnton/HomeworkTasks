package GuessNumber;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private int randomValue;
    private int tryingGuess;
    private String userCommand;
    private final int tryNumber;
    private final int min;
    private final int max;

    public GuessNumber(int tryNumber, int min, int max) {
        this.tryNumber = tryNumber;
        this.min = min;
        this.max = max;
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
    }


    public void start() {
        System.out.println("Привет, я загадал число от " + min + " до " + max + ". Попробуй угадать его за " + tryNumber + " попыток! Удачи)");
        generateNumber();
    }

    public void generateNumber() {
        randomValue = random.nextInt((max - min) + 1) + min;
        System.out.println("Число было сгенерировано. Можешь начинать угадывать его). В любой момент при вводе комманды \"exit\" программа завершит свою работу ");
        guessNumber();
    }

    public void guessNumber() {
        for (int tryCounter = 0; tryCounter < tryNumber; tryCounter++) {
            try {
                tryingGuess = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException exception) {
                userCommand = scanner.nextLine();
                if (userCommand.equalsIgnoreCase("exit")) {
                    exit();
                } else {
                    System.out.println("Некоректная комманда");
                    continue;
                }
            }
            if (tryingGuess == randomValue) {
                System.out.println("Поздравляю, вы угадали число за " + (tryCounter + 1) + " попыток.");
                exit();
            }
            if (tryCounter == 0) {
                System.out.println("Не угадал, попробуй ещё");
            }
            if (tryCounter >= 1) {
                if (tryingGuess >= randomValue - 5 && tryingGuess <= randomValue + 5) {
                    System.out.println("Жарко, попробуй ещё");
                } else if (tryingGuess >= randomValue - 15 && tryingGuess <= randomValue + 15) {
                    System.out.println("Тепло, попробуй ещё");
                } else if (tryingGuess <= randomValue - 16 || tryingGuess >= randomValue + 16) {
                    System.out.println("Холодно, попробуй ещё");
                }
            }
            if (tryCounter == tryNumber - 1) {
                System.out.println("Колличество попыток закончилось, а ты всё так и не догадался какое число я задумал.");
                exit();
            }
        }
    }

    public void exit() {
        System.out.println("Вы хотите завершить роботу программы? Yes (выход) / No (перезапуск программы)");
        switch (userCommand = scanner.nextLine()) {
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
