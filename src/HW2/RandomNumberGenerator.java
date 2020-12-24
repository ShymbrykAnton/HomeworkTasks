package HW2;

import java.util.Random;

public class RandomNumberGenerator {
    Random random = new Random();

    public void getRandomValue() {
        int randomValue;
        randomValue = random.nextInt((100 - 1) + 1) + 1;
        System.out.println("Случайное число: " + randomValue);
    }

    public void getTenTimesRandomValues() {
        int randomValue;
        for (int i = 0; i < 10; i++) {
            randomValue = random.nextInt((100 - 1) + 1) + 1;
            System.out.println("Случайное число №" + (i + 1) + ": " + randomValue);
        }
    }

    public void getTenTimesRandomValuesFromZeroToTen() {
        int randomValue;
        for (int i = 0; i < 10; i++) {
            randomValue = random.nextInt((10) + 1);
            System.out.println("Случайное число №" + (i + 1) + ": " + randomValue);
        }
    }
    public void getTenTimesRandomValuesFromTwentyToFifty() {
        int randomValue;
        for (int i = 0; i < 10; i++) {
            randomValue = random.nextInt((50-20) + 1)+20;
            System.out.println("Случайное число №" + (i + 1) + ": " + randomValue);
        }
    }
    public void getTenTimesRandomValuesFromMinusTenToTen() {
        int randomValue;
        for (int i = 0; i < 10; i++) {
            randomValue = random.nextInt((20) + 1);
            randomValue -= 10;
            System.out.println("Случайное число №" + (i + 1) + ": " + randomValue);
        }
    }
    public void getRandomTimesRandomValues() {
        int randomValue, numberOfRandomNumbers;
        numberOfRandomNumbers = random.nextInt((10-3)+1)+3;
        for (int i = 0; i < numberOfRandomNumbers; i++) {
            randomValue = random.nextInt((45) + 1);
            randomValue -= 10;
            System.out.println("Случайное число №" + (i + 1) + ": " + randomValue);
        }
    }
}

