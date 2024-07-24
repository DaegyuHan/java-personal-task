package calculator;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int restart = 1;
        int[] resultArr = new int[10];
        int count = 0;

        while (restart ==1) {

        int result = 0; //result 선언 및 초기화
        System.out.println("------------------------");
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
        char oper = sc.next().charAt(0);


            if (oper == '+') {   // 덧셈 연산
                result = num1 + num2;
                System.out.println("결과 : " + result);
                System.out.println("------------------------");
            } else if (oper == '-') {   // 뺄셈 연산
                result = num1 - num2;
                System.out.println("결과 : " + result);
                System.out.println("------------------------");
            } else if (oper == '*') {   // 곱셈 연산
                result = num1 * num2;
                System.out.println("결과 : " + result);
                System.out.println("------------------------");
            } else if (oper == '/') {   // 나눗셈 연산
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println("결과 : " + result);
                    System.out.println("------------------------");
                }
            } else {
                System.out.println("정확한 값을 입력해주세요.");
            }

            resultArr[count] = result;
            System.out.println(Arrays.toString(resultArr));
            count++;


            int ask_replay = 0;     // 다시 계산하기 위한 반복문 제어용 변수 선언,초기화

            while (ask_replay == 0) {
                System.out.println("더 계산하시겠습니까? (숫자 입력)" + "\n" + "1.yes" + "\n" + "2.no");
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
