package lv.javaguru.Lesson7;

public class ArrayService {
    public int[] createArray(int size) {
        return new int[size];
    }

    public void fillArrayWithNumbers(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i;
    }

    public void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int elementofArray : array) {
            System.out.println("Number " + elementofArray);
        }
    }

    public void arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Total SUM = " + sum);
    }
}
