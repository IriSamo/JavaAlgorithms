import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumOfNumTest {

    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {9, 9},
                {0, -1},
                {-5, -1},
                {18, 9},
                {27, 9},
                {1455, 6}
        };
    }

    @Test(dataProvider = "data")
    public void testPositivesNumbers_HappyPath(int n, int expectedResult) {
        //AAA
        //arrange
//        int n = -109;
//        int expectedResult = -1;

        //act
        int actualResult = SumOfNum.sumOfNum(n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
