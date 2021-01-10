import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest {
    @Test(dataProvider = "data")
    public void testCase(double number1,double number2 , double expectedResult){
        Assert.assertEquals(Calculator.multiply(number1,number2),expectedResult,0.005);

    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {5,7,35},
                {2.4,5.3,12.72},
                {5,-2,-10},
                {-5.4,2.6,-14.04},
                {-5.8,0,0}
        };
    }
}
