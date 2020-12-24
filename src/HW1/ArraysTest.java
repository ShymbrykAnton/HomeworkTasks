package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    Arrays arrays = new Arrays();

    @Test
    void getMinElementInArray_NEGATIVE_FIRST_NUMBER() {
        int[] array = new int[]{-5, 0, 1, 6, 8, 9, 10};
        int expected = -5;
        int actual = arrays.getMinElementInArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinElementInArray_NEGATIVE_MIDDLE_NUMBER() {
        int[] array1 = new int[]{-8, 0, 1, -123, 8, 9, 10};
        int expected1 = -123;
        int actual1 = arrays.getMinElementInArray(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void getMinElementInArray_ZERO() {
        int[] array2 = new int[]{23, 0, 1, 6, 8, 9, 10};
        int expected2 = 0;
        int actual2 = arrays.getMinElementInArray(array2);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void getMinElementInArray_POSITIVE_LAST_NUMBER() {
        int[] array3 = new int[]{125, 160, 293, 50};
        int expected3 = 50;
        int actual3 = arrays.getMinElementInArray(array3);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void getMinElementInArray_SAME_NUMBERS() {
        int[] array4 = new int[]{-293, -160, -293, -50, -293, -200};
        int expected4 = -293;
        int actual4 = arrays.getMinElementInArray(array4);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    void getMaxElementInArray_LAST_NUMBER() {
        int[] array = new int[]{-5, 0, 1, 6, 8, 9, 10};
        int expected = 10;
        int actual = arrays.getMaxElementInArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxElementInArray_MIDDLE_NUMBER() {
        int[] array1 = new int[]{-8, 0, 1, 123, 8, 9, 10};
        int expected1 = 123;
        int actual1 = arrays.getMaxElementInArray(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void getMaxElementInArray_FIRST_NUMBER() {
        int[] array2 = new int[]{23, 0, 1, 6, 8, 9, 10};
        int expected2 = 23;
        int actual2 = arrays.getMaxElementInArray(array2);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void getMaxElementInArray_NEGATIVE_NUMBER() {
        int[] array3 = new int[]{-125, -160, -50, -293, -200};
        int expected3 = -50;
        int actual3 = arrays.getMaxElementInArray(array3);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void getMaxElementInArray_SAME_NUMBERS() {
        int[] array4 = new int[]{-50, -160, -50, -50, -293, -200};
        int expected4 = -50;
        int actual4 = arrays.getMaxElementInArray(array4);
        Assertions.assertEquals(expected4, actual4);
    }

    @Test
    void getMinElementIndex_FIRST_INDEX() {
        int[] array = new int[]{-5, 0, 1, 6, 8, 9, 10};
        int expected = 0;
        int actual = arrays.getMinElementIndex(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinElementIndex_LAST_INDEX() {
        int[] array1 = new int[]{-8, 0, 1, -123, 8, 9, -1000};
        int expected1 = 6;
        int actual1 = arrays.getMinElementIndex(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void getMinElementIndex_MIDDLE_INDEX() {
        int[] array2 = new int[]{23, 0, 1, -6, 8, 9, 10};
        int expected2 = 3;
        int actual2 = arrays.getMinElementIndex(array2);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void getMinElementIndex_SAME_NUMBERS() {
        int[] array3 = new int[]{0, -500, 0, -500, -500};
        int expected3 = 1;
        int actual3 = arrays.getMinElementIndex(array3);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void getMaxElementIndex_FIRST_INDEX() {
        int[] array = new int[]{523, 0, 123, 6, 8, 9, 10};
        int expected = 0;
        int actual = arrays.getMaxElementIndex(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxElementIndex_LAST_INDEX() {
        int[] array1 = new int[]{-8, 0, 1, -123, 8, 9, 10};
        int expected1 = 6;
        int actual1 = arrays.getMaxElementIndex(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void getMaxElementIndex_MIDDLE_INDEX() {
        int[] array2 = new int[]{23, 0, 1, 600, 8, 9, 10};
        int expected2 = 3;
        int actual2 = arrays.getMaxElementIndex(array2);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void getMaxElementIndex_SAME_NUMBERS() {
        int[] array3 = new int[]{0, -500, 0, -500, -500};
        int expected3 = 0;
        int actual3 = arrays.getMaxElementIndex(array3);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void getSumNotEvenIndexElement_STANDART() {
        int[] array = new int[]{5, 2, 123, 6, 8, 9, 10};
        int expected = 17;
        int actual = arrays.getSumNotEvenIndexElement(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getSumNotEvenIndexElement_NEGATIVE_NUMBERS() {
        int[] array1 = new int[]{-8, -5, 1, -123, 8, 9, 10};
        int expected1 = -119;
        int actual1 = arrays.getSumNotEvenIndexElement(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void reverseArray_STANDART_REVERSE() {
        int[] array = new int[]{5, 2, 123, 6, 8, 9, 10};
        String expected = "Перевернутый массив: 10 9 8 6 123 2 5 ";
        String actual = arrays.reverseArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void reverseArray_NEGATIVE_NUMBERS() {
        int[] array1 = new int[]{-8, -5, 1, -123, 8, 9};
        String expected1 = "Перевернутый массив: 9 8 -123 1 -5 -8 ";
        String actual1 = arrays.reverseArray(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void reverseArray_SAME_NUMBERS() {
        int[] array2 = new int[]{1, 0, 1, 0, 1, 0, 1, 0};
        String expected2 = "Перевернутый массив: 0 1 0 1 0 1 0 1 ";
        String actual2 = arrays.reverseArray(array2);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void countNotEvenElementInArray_STANDART() {
        int[] array1 = new int[]{-8, -5, 1, -123, 8, 9, 10};
        int expected1 = 4;
        int actual1 = arrays.countNotEvenElementInArray(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void countNotEvenElementInArray_ALL_NUMBERS_ARE_NOT_EVEN() {
        int[] array2 = new int[]{23, 5, 7, 9, 11, 9, 27, 1};
        int expected2 = 8;
        int actual2 = arrays.countNotEvenElementInArray(array2);
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void countNotEvenElementInArray_ALL_NUMBERS_ARE_EVEN() {
        int[] array3 = new int[]{2, 4, 6, 8, 10};
        int expected3 = 0;
        int actual3 = arrays.countNotEvenElementInArray(array3);
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    void swapFirstAndSecondPartOfArray_NOT_EVEN_NUMBER_OF_ELEMENTS() {
        int[] array = new int[]{5, 2, 123, 6, 8, 9, 10};
        String expected = "8 9 10 6 5 2 123 ";
        String actual = arrays.swapFirstAndSecondPartOfArray(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void swapFirstAndSecondPartOfArray_STANDART() {
        int[] array1 = new int[]{-8, -5, 1, -123, 8, 9};
        String expected1 = "-123 8 9 -8 -5 1 ";
        String actual1 = arrays.swapFirstAndSecondPartOfArray(array1);
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    void swapFirstAndSecondPartOfArray_SAME_NUMBERS() {
        int[] array2 = new int[]{1, 0, 1, 8, 1, 0, 1, 0};
        String expected2 = "1 0 1 0 1 0 1 8 ";
        String actual2 = arrays.swapFirstAndSecondPartOfArray(array2);
        Assertions.assertEquals(expected2, actual2);
    }
}
