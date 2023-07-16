import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SortAStringTest {

    @DataProvider
    public Object[][] dataSortAString() {
        return new Object[][] {
                {"SortAString", "ASSginorrtt"},
                {"CCccBBbbAAaa", "AABBCCaabbcc"},
                {"CBAcba", "ABCabc"},
                {"cCbBaA", "ABCabc"}
        };
    }

    @Test(dataProvider = "dataSortAString")
    public static void testSortStringWithArraysSort(String st, String expectedResult) {

        Assert.assertEquals(SortAString.sortStringWithArraysSort(st), expectedResult);
    }

    @Test(dataProvider = "dataSortAString")
    public static void testSortStringWithBubbleSort(String st, String expectedResult) {

        Assert.assertEquals(SortAString.sortStringWithBubbleSort(st), expectedResult);
    }
}
