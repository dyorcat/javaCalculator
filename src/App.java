import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] results = new double[10];
        int resultCount = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요.");
            double num1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요.");
            double num2 = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요. (+, -, *, /)");
            char operator = sc.next().charAt(0);

            double result = 0;

            switch (operator) {
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
                    } else {
                        System.out.print("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다. ");
                    }
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호를 입력하세요.");
                    break;
            }

            if (resultCount < results.length ) {
                System.out.println("결과 : " + result);
                results[resultCount++] = result;
                System.out.println("저장된 결과값 :" + Arrays.toString(results));
            } else {
                System.out.println("결과 저장소가 가득 찼습니다. 더 이상 결과를 저장할 수 없습니다. ");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitInput = sc.next();
            if (exitInput.equalsIgnoreCase("exit")) {
                break;
            }

        }



    }
}
