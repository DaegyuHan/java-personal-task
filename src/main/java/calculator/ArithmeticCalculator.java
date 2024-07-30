package calculator;

public class ArithmeticCalculator extends Calculator {

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    ModOperator mosoperator;

    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
        mosoperator = new ModOperator();
    }

    public double calculate(int num1, int num2, char operation) throws MessageException {

        double result = 0;
        switch (operation) {
            case '+':
                result = addOperator.operate(num1, num2);   // 인터페이스를 이용한 코드 단순화
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = divideOperator.operate(num1, num2);
                    break;
                } else {
                    throw new MessageException("분모는 0 이 되면 안됩니다.");
                }
            case '%':
                result = mosoperator.operate(num1, num2);
            default:
                throw new MessageException("연산자를 바르게 입력해주세요.");
        }
        setResultQue(result);
        return result;
    }
}
