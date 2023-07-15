import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SortAStringTest {

    @DataProvider
    public Object[][] dataSortAString() {
        return new Object[][] {
                {new String("SortAString"), new String("ASSginorrtt")},
        };
    }

    @Test(dataProvider = "dataSortAString")
    public static void testSortAString(String st, String expectedResult) {

        Assert.assertEquals(SortAString.sortString(st), expectedResult);
    }
}
