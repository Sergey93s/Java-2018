package lv.javaguru.Lesson6Homework1;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        numberService.setFirstNumber(5);
        numberService.setSecondNumber(10);
        numberService.sumInRange();
        numberService.getEvenNumberCount();
        System.out.println(numberService);
    }
}
