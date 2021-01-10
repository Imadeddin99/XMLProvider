import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractTest {
    @Test(dataProvider = "data")
    public void testCase(double number1,double number2 , double expectedResult){
        Assert.assertEquals(Calculator.subtract(number1,number2),expectedResult,0.007);

    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {5,7,-2},
                {2.4,5.3,-2.9},
                {5,-2,7},
                {-5.4,2.6,-8},
                {-5.8,0,-5.8}
        };
    }
}
