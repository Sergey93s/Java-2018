package lv.javaguru.Lesson7;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int[] array = service.createArray(4);
        service.fillArrayWithNumbers(array);
        service.invertArray(array);
        service.printArrayToConsole(array);
        service.arraySum(array);
    }
}
