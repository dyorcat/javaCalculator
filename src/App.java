import java.util.*;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        while (true) {
                System.out.print("첫 번째 숫자를 입력하세요.");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요.");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요. (+, -, *, /)");
                char operator = sc.next().charAt(0);

                double result = calculator.calculate(num1, num2, operator);
                System.out.println("결과 : " + result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (y/n) : ");
                String removeAnswer = sc. next();
                if (removeAnswer.equalsIgnoreCase("y")) {
                    calculator.removeResult(0);
                }

                System.out.print("연산 기록을 조회하시겠습니까? (y/n): ");
                String historyAnswer = sc.next();
                if (historyAnswer.equalsIgnoreCase("y")) {
                    System.out.println(calculator.getOperationHistory());
                }

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
                String exitInput = sc.next();
                if (exitInput.equalsIgnoreCase("exit")) {
                    break;
                }
        }
    }
}
