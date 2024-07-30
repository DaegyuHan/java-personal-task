package calculator;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int restart = 1;                                    // 계산기 반복문 접근 위한 변수

        while (restart == 1) {


            System.out.println("------------------------");
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
            char operation = sc.next().charAt(0);


            Calculator calculator = new Calculator();
            try {
                System.out.println(calculator.calculate(num1, num2, operation));

            } catch (MessageException e) {
                System.out.println(e.getMessage());

            }


            int askDeleteReplay = 0;          // 연산결과 삭제 유무 질문에 올바른 답을 얻기 위한 반복문 진입 변수
            while (askDeleteReplay == 0) {
                System.out.println("""
                        가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (숫자 입력)
                        1.yes
                        2.no""");
                int askDelete = sc.nextInt();
                try {
                    askDeleteReplay = calculator.removeResult(askDelete);
                } catch (MessageException e) {
                    System.out.println(e.getMessage());

                }
            }

//            int ask_inquiry_replay = 0;         // 연산결과 출력 희망 질문에 올바른 답 얻기 위한 진입 변수
//            while (ask_inquiry_replay == 0) {
//                System.out.println("""
//                        저장된 연산결과를 조회하시겠습니까? (숫자 입력)
//                        1.yes
//                        2.no
//                        """);
//                int ask_inquiry = sc.nextInt();
//                if (ask_inquiry == 1) {
//                    System.out.print("저장된 값 :");
//                    for (int value : resultQue)
//                    {
//                        System.out.print(" " + value);
//                        ask_inquiry_replay = 1;
//                    }
//                    System.out.println(" ");
//                } else if (ask_inquiry == 2)
//                {
//                    ask_inquiry_replay = 1;
//                    continue;
//                } else
//                {
//                    System.out.println("정확한 값을 입력해주세요.");
//                }
//            }


            int ask_replay = 0;     // 다시 계산하기 위한 반복문 제어용 변수 선언,초기화

            while (ask_replay == 0) {
                System.out.println("""
                        더 계산하시겠습니까? (숫자 입력)
                        1.yes
                        2.no""");
                ask_replay = sc.nextInt();
                if (ask_replay == 1) {
                    break;
                } else if (ask_replay == 2) {
                    restart = 2;
                } else {
                    System.out.println("정확한 값을 입력해주세요.");
                    ask_replay = 0;
                }
            }
        }
    }
}
