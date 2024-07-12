import java.util.*;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("첫 번째 숫자를 입력하세요.");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요.");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요. (+, -, *, /)");
                char operator = sc.next().charAt(0);

                double result = calculator.calculate(num1, num2, operator);
                System.out.println("결과 : " + result);

                System.out.print("연산 기록을 조회하시겠습니까? (y/n): ");
                String answer = sc.next();
                if (answer.equalsIgnoreCase("y")) {
                    List<String> history = calculator.getOperationHistory();
                    System.out.println("Operation History:");
                    for (String h : history) {
                        System.out.println(h);
                    }
                }

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
                String exitInput = sc.next();
                if (exitInput.equalsIgnoreCase("exit")) {
                    break;
                }

            } catch (CalculatorException e) {
                System.out.println("Calculator Exception: " + e.getMessage());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("입력이 잘못되었습니다. 다시 시도해주세요.");
                sc.nextLine();
            }
        }
    }
}
