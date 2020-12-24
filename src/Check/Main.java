package Check;

import HW1.Arrays;
import HW3.UseMath;

public class Main {
    public static void main(String[] args) {
//        ConditionalOperators operators = new ConditionalOperators();
//        String result1 = operators.getMarkByRating(83);
//        System.out.println("Результат: " + result1);
//
//        Cycles cycles = new Cycles();
//        String result2 = cycles.getSquareRoot(9);
//        System.out.println(result2);
//
        Arrays arrays = new Arrays();
        // Возможно ли сделать инициализацию исходных данных массива и вызов метода одной строкой?
        int[] array = {-9, 7, -6, 4, -5, 2, -3, 1,0,1, -8, 10, -11};
        String result3 = arrays.bubbleSort(array);
        System.out.println(result3);

//        Randomizer randomizer = new Randomizer();
//        randomizer.start();

//        GuessNumber guessNumber = new GuessNumber(5,1,100);
//        guessNumber.start();

//        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
//        randomNumberGenerator.getRandomTimesRandomValues();

//        DrawingStars drawingStars = new DrawingStars();
//        drawingStars.drawX();

//        UseMath useMath = new UseMath();
//        String result = useMath.calculateExpression(360);
//        System.out.println(result);
    }
}

