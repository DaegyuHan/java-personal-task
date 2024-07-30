package calculator;

public class ArithmeticCalculator extends Calculator {

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    public int calculate(int num1, int num2, char operation) throws MessageException {

        int result = 0;
        switch (operation) {
            case '+':
                result = addOperator.addOper(num1, num2);
                break;
            case '-':
                result = subtractOperator.subtractOper(num1, num2);
                break;
            case '*':
                result = multiplyOperator.multiplyOper(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = divideOperator.divideOper(num1, num2);
                    break;
                } else {
                    throw new MessageException("분모는 0 이 되면 안됩니다.");
                }
            default:
                throw new MessageException("연산자를 바르게 입력해주세요.");
        }
        setResultQue(result);
        return result;
    }
}
