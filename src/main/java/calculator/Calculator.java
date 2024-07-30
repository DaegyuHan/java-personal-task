package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
        int num1;
        int num2;
        char operation;
        int result;
    private  Queue<Integer> resultQue = new LinkedList<>(); //무제한으로  저장하기 위해서 Queue 선언

    public Queue<Integer> getResultQue() {
        return resultQue;
    }

    public void setResultQue(int result) {
        resultQue.add(result);
    }

    public Calculator() {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int calculate() throws MessageException {

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
                    throw new MessageException("분모는 0 이 되면 안됩니다.");
                }
            default:
                throw new MessageException("연산자를 바르게 입력해주세요.");
        }
        setResultQue(result);
        return result;
    }

}
