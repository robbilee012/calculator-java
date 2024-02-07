import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    public static void main(String[] args) {
        testCalculate();
    }

    public static void testCalculate() {
        List<Float> nums = new ArrayList<>(Arrays.asList(5f, 2f, 3f, 4f));
        List<String> operacije = new ArrayList<>(Arrays.asList("+", "*", "/"));

        Calculator.Calculate(nums, operacije);

        float expectedResult = 6.5f;

        if (Calculator.finalResult == expectedResult) {
            System.out.println("Test Passed: Rezultat je " + Calculator.finalResult);
        } else {
            System.out.println("Test Failed: Ocekivan rezultat je " + expectedResult + ", ali dobijeni broj je "
                    + Calculator.finalResult);
        }
    }
}