import java.util.ArrayList;
import java.util.List;
public class Calculator {
    private List<String> results;

    public Calculator(List<String> results) {
        this.results = results;
    }
    public double calculate(int num1, int num2, char operator)  {
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
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new UnsupportedOperationException("올바른 연산자가 아닙니다.");
        }

        addToOperationHistory(operation + " = " + result);
        return result;
    }

    public List<String> getOperationHistory() {
        return results;
    }

    private void addToOperationHistory(String entry) {
        results.add(entry);
    }

    public void removeResult(int index) {
        this.results.remove(index);
    }
}