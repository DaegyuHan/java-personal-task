package calculator;

public class CircleCalculator extends Calculator {

    public double pieCalculate(double radius) {
        double result = radius * radius *PI;
        setPieResultQue(result);
        return result;
    }
}
