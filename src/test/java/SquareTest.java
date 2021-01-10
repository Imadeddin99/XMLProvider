import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareTest {

    @Test(dataProvider = "data")
    public void testCase(double number1 , double expectedResult){
        Assert.assertEquals(Calculator.squar(number1),expectedResult,0.007);

    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {5,25},
                {2.4,5.76},
                {-5,25},
                {-5.4,29.16},
                {0,0}
        };
    }


}
