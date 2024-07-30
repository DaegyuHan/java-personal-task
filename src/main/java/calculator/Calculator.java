package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private static Queue<Double> resultQue; //무제한으로  저장하기 위해서 Queue 선언
    private static Queue<Double> pieResultQue; // 원 넓이 계산
    final double PI = 3.14; // 원주율 PI 는 바뀌지 않으므로 final 을 사용했다.

    public Calculator() {
        resultQue = new LinkedList<>();
        pieResultQue = new LinkedList<>();
    }

    public Queue<Double> getResultQue() {
        return resultQue;
    }

    public void setResultQue(double result) {
        resultQue.add(result);
    }

    public Queue<Double> getPieResultQue() {
        return pieResultQue;
    }

    public void setPieResultQue(double result) {
        pieResultQue.add(result);
    }



    public int removeResult(int askDelete) throws MessageException {
        int askDeleteReplay = 0;

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

    public int inquiryResults(int askInquiry) throws MessageException {
        int askInquiryReplay = 0;

        if (askInquiry == 1) {
            System.out.print("저장된 값 :");
            for (double value : resultQue) {
                System.out.print(" " + value);
                askInquiryReplay = 1;
            }
            System.out.println(" ");
        } else if (askInquiry == 2) {
            askInquiryReplay = 1;
        } else {
            throw new MessageException("올바른 숫자를 입력해주세요.");
        }
        return askInquiryReplay;
    }


    public void inquiryPieResult() {

            System.out.print("저장된 값 :");
            for (double value : pieResultQue) {
                System.out.print(" " + value);
            }
            System.out.println(" ");
        }
    }

