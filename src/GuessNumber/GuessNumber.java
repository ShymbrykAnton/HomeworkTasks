package GuessNumber;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static GuessNumber.Utils.*;

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
            System.out.println(INCORRECT_VALUE);
            System.exit(0);
        }
        if (max < min || max > 200) {
            System.out.println(INCORRECT_VALUE);
            System.exit(0);
        }
        if (tryNumber < 1 || tryNumber > 15) {
            System.out.println(INCORRECT_VALUE);
            System.exit(0);
        }
    }


    public void start() {
        System.out.printf("Привет, я загадал число от %s до %s. Попробуй угадать его за %s попыток! Удачи:)\n",min,max,tryNumber);
        generateNumber();
    }

    public void generateNumber() {
        randomValue = random.nextInt((max - min) + 1) + min;
        System.out.println("Число было сгенерировано. Можешь начинать угадывать его. В любой момент при вводе комманды \"exit\" программа завершит свою работу ");
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
                    System.out.println(INCORRECT_COMMAND);
                    continue;
                }
            }
            if (tryingGuess < min || tryingGuess > max) {
                System.out.printf("Ты же сам задал диапазон от %s до %s. Так зачем ты за него выходишь? Минус одна попытка :(\n", min, max);
            } else if (tryingGuess == randomValue) {
                System.out.println("Поздравляю, вы угадали число за " + (tryCounter + 1) + " попыток.");
                exit();
            } else if (tryCounter == 0) {
                System.out.printf("Не угадал%s", TRY_AGAIN);
            } else {
                if (tryingGuess >= randomValue - 5 && tryingGuess <= randomValue + 5) {
                    System.out.printf("Жарко%s", TRY_AGAIN);
                } else if (tryingGuess >= randomValue - 15 && tryingGuess <= randomValue + 15) {
                    System.out.printf("Тепло%s", TRY_AGAIN);
                } else if (tryingGuess <= randomValue - 16 || tryingGuess >= randomValue + 16) {
                    System.out.printf("Холодно%s", TRY_AGAIN);
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
                System.out.println(INCORRECT_COMMAND);
                exit();
                break;
        }
    }

}
