import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Java Program that tests Bubble Sort algorithm using DataProvider
 *
 * @author SIri
 */
public class BubbleSortTest {

    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {new int[]{3, 2, 1}, new int[]{1, 2, 3}},
                {new int[]{}, new int[]{}},
                {new int[]{5}, new int[]{5}},
                {new int[]{5, 7, -8, 1, 18, 0}, new int[]{-8, 0, 1, 5, 7, 18}}
        };
    }

    /**
     * Test for Bubble Sort algorithm
     *
     * @param1 array1
     * @param2 array2
     */
    @Test(dataProvider = "data")
    public static void testBubbleSort(int[] array, int[] expectedResult) {

        int[] actualResult = BubbleSort.bubbleSort(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
