import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciSequenceTest {

    @Test
    public void testFibonacciIterativeApproach() {
        int n = 10;
        int expectedResult = 55;

        int actualResult1 = FibonacciSequence.fibonacciIterative(n);

        Assert.assertEquals(actualResult1, expectedResult);

    }

    @Test
    public void testFibonacciRecursion() {
        int n = 10;
        int expectedResult = 55;

        int actualResult2 = FibonacciSequence.fibonacciRecursion(n);

        Assert.assertEquals(actualResult2, expectedResult);
    }

    @Test
    public void testFibonacciRecursionWithMemorization() {
        int n = 10;
        int expectedResult = 55;

        int actualResult3 = FibonacciSequence.fibonacciMemorize(n);

        Assert.assertEquals(actualResult3, expectedResult);
    }
}