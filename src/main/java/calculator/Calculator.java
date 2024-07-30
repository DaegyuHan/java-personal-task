package calculator;

public class Calculator {
    int num1;
    int num2;
    char operation;
    int result;


    public Calculator(int num1, int num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int calculate() throws messageException {

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    break;
                } else {
                    throw new messageException("분모는 0 이 되면 안됩니다.");
                }
            default:
                throw new messageException("연산자를 바르게 입력해주세요.");
        }

        return result;
    }
}
