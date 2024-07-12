import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        do {

            System.out.println("어떤 계산을 하시겠습니까? (1: 사칙연산, 2: 원의 넓이)");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: (+, -, *, /");

                char operator = sc.next().charAt(0);

                double result = arithmeticCalculator.calculate(num1, num2, operator);
                arithmeticCalculator.getResults().add(result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (y / n)");
                if (Objects.equals(sc.next(), "y")) {
                    arithmeticCalculator.removeResult(0);
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (y / n)");
                if (Objects.equals(sc.next(), "y")) {
                    arithmeticCalculator.inquiryResults();
                }
            } else {
                System.out.println("원의 반지름을 입력하세요: ");
                int radius = sc.nextInt();

                double area = circleCalculator.calculate(radius);
                circleCalculator.getResults().add(area);
                System.out.println("반지름이 " + radius + "인 원의 넓이는 : " + area);

                System.out.println("저장된 연산결과를 조회하시겠습니까? (y / n)");
                if (Objects.equals(sc.next(), "y")) {
                    System.out.println("저장된 원의 넓이 전체 조회: ");
                    circleCalculator.inquiryResults();
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));

    }
}
