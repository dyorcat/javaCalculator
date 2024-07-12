import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Double> results = new LinkedList<>();

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

                System.out.println("결과: " + result);
                results.add(result);

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
                String removeInput = sc.next();
                if (removeInput.equalsIgnoreCase("remove")) {
                    if (!results.isEmpty()) {
                        double removedResult = results.removeFirst();
                        System.out.println("삭제된 결과: " + removedResult);
                    } else {
                        System.out.println("저장된 연산 결과가 없습니다.");
                    }
                }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력시 조회)");
            String inquiryInput = sc.next();
            if (inquiryInput.equalsIgnoreCase("inquiry")) {
                System.out.println("저장된 계산 결과 :" + results);
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exitInput = sc.next();
            if (exitInput.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
