package calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
        char oper = sc.next().charAt(0);

        int result = 0; //result 선언 및 초기화

        if (oper == '+') {
            result = num1 + num2;
        } else if (oper == '-') {
            if (num1 >= num2) {
                result = num1 - num2;
            } else {
                result = num2 - num1;
            }
        } else if (oper == '*') {
            result = num1 * num2;
        } else if (oper == '/') {
            if (num2 == 0 ) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("정확한 값을 입력해주세요.");
        }

        System.out.println("결과 : " + result);
    }
}
