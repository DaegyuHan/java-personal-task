package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private  Queue<Integer> resultQue = new LinkedList<>(); //무제한으로  저장하기 위해서 Queue 선언

    public Queue<Integer> getResultQue() {
        return resultQue;
    }

    public void setResultQue(int result) {
        resultQue.add(result);
    }


    public int calculate(int num1, int num2, char operation) throws MessageException {

        int result = 0;
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

    public int removeResult(int askDelete) throws MessageException {
        int askDeleteReplay=0;

        if (askDelete == 1) {
            askDeleteReplay = 1;
            resultQue.poll();
        } else if (askDelete == 2) {
            askDeleteReplay = 1;
        } else {
            throw new MessageException("올바른 숫자를 입력해주세요.");
        }
        return askDeleteReplay;
    }

}
