package hw1;

public class Arrays {
    public int getMinElementInArray(int[] array) {
        int i = array.length - 1, minNumber = array[0];
        for (; i >= 0; i--) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public int getMaxElementInArray(int[] array) {
        int index = array.length - 1, maxNumber = array[0];
        for (; index >= 0; index--) {
            if (array[index] > maxNumber) {
                maxNumber = array[index];
            }
        }
        return maxNumber;
    }

    public int getMinElementIndex(int[] array) {
        int index = array.length - 1, minNumber = array[0], minIndex = 0;
        for (; index >= 0; index--) {
            if (array[index] <= minNumber) {
                minNumber = array[index];
                minIndex = index;
            }
        }
        return minIndex;
    }

    public int getMaxElementIndex(int[] array) {
        int index = array.length - 1, maxNumber = array[0], maxIndex = 0;
        for (; index >= 0; index--) {
            if (array[index] >= maxNumber) {
                maxNumber = array[index];
                maxIndex = index;
            }
        }
        return maxIndex;
    }

    public int getSumNotEvenIndexElement(int[] array) {
        int index = 0, sum = 0;
        for (; index < array.length; index++) {
            if ((index + 2) % 2 != 0) {
                sum += array[index];
            }
        }
        return sum;
    }

    public String reverseArray(int[] array) {
        int startIndex = 0, endIndex = array.length - 1, rememberStart;
        StringBuilder resultArray = new StringBuilder();
        for (; startIndex < array.length / 2; startIndex++, endIndex--) {
            rememberStart = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = rememberStart;
        }
        for (int j : array) {
            resultArray.append(j).append(" ");
        }
        return "Перевернутый массив: " + resultArray;
    }

    public int countNotEvenElementInArray(int[] array) {
        int index = 0, count = 0;
        for (; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public String swapFirstAndSecondPartOfArray(int[] array) {
        int startSwapIndex = 0, rememberStart;
        int notEvenLength = array.length % 2;
        StringBuilder swappedStringArray = new StringBuilder();
        for (; startSwapIndex < array.length / 2; startSwapIndex++) {
            rememberStart = array[startSwapIndex];
            array[startSwapIndex] = array[(array.length / 2) + startSwapIndex + notEvenLength];
            array[(array.length / 2) + startSwapIndex + notEvenLength] = rememberStart;
        }
        for (int j : array) {
            swappedStringArray.append(j).append(" ");
        }
        return swappedStringArray.toString();
    }
}
//9.	Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))


