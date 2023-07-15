import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}},
                {new int[]{2, 7, 3, 10}, new int[]{10, 3, 7, 2}},
                {new int[]{3}, new int[]{3}},
                {new int[]{}, new int[]{}}
        };
    }

    @Test(dataProvider = "testData")
    public void testReserveIntArray(int[] array, int[] expectedResult) {

        int[] actualResult = ReverseArray.reverseArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
