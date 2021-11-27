import java.text.DecimalFormat;

public class Numbers {

    public int sum(int numbers) {
        int result = 0;
        for (int i = 0; i <= numbers; i++) {
            result += i;
        }
        return result;
    }

    public int root(int numbers, int degree) {
        int result = numbers;
        for (int i = 1; i < degree; i++) {
            result *= numbers;
        }
        return result;
    }

    public double sqrt (int numbers) {
        return Math.sqrt(numbers);
    }

}
