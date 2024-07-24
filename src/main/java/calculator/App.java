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

    }
}
