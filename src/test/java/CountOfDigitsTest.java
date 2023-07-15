import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountOfDigitsTest {

    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {1455369852369852147L, 19},
                {0, 1},
                {111, 3},
                {10, 2},
                {-100, -1},
                {5, 1}
        };
    }

    @Test(dataProvider = "data")
    public static void testHappyPath(long n, int expectedResult) {
//        int n = 9;
//
//        int expectedResult = 1;

        int actualResult = CountOfDigits.countOfDigits(n);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
