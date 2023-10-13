import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestFibonacci {
    @Test
    public void testFirstTenFibonacciNumbers() {
        int n = 10; // The number of Fibonacci numbers to generate
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] fibonacci = new int[n];

        // Initialize the first two Fibonacci numbers
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculate the remaining Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Use assertArrayEquals to compare the expected Fibonacci sequence with the generated one
        assertArrayEquals(expected, fibonacci);
    }
}
