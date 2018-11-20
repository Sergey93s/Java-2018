package lv.javaguru.Lesson6Homework1;

public class NumberService {
    private int firstNumber;
    private int secondNumber;
    private int sumInRange;
    private int getEvenNumberCount;


    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void sumInRange() {
        sumInRange = 0;
        for (int i = firstNumber; i <= secondNumber; i++)
            sumInRange = sumInRange + i;
        System.out.println("Sum= " + sumInRange);
    }

    public void getEvenNumberCount() {
        getEvenNumberCount = 0;
        for (int i = firstNumber; i <= secondNumber; i++)
            if (i % 2 == 0) {
                getEvenNumberCount++;
            }
    }

    @Override
    public String toString() {
        return "NumberService{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", sumInRange=" + sumInRange +
                ", getEvenNumberCount=" + getEvenNumberCount +
                '}';
    }
}
