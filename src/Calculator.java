import java.util.List;

public abstract class Calculator {
    public static final double PI = 3.14;

    // 연산 결과들 저장된 리스트 선언
    private final List<Double> results;


    public Calculator(List<Double> results) {
        this.results = results;
    }

    public void removeResult(int index) {
        this.results.remove(index);
    }

    abstract void inquiryResults();

    public List<Double> getResults() {
        return results;
    }
}
