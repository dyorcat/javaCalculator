import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}

public class Calculator {
    private List<String> operationHistory;

    public Calculator() {
        operationHistory = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) throws CalculatorException {
        int result = 0;
        String operation = num1 + " " + operator + " " + num2;

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
                if (num2 == 0) {
                    throw new CalculatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new CalculatorException("올바른 연산자가 아닙니다.");
        }

        operationHistory.add(operation + " = " + result);
        return result;
    }

    public List<String> getOperationHistory() {
        return operationHistory;
    }

}