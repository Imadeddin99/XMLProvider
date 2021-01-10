import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AdditionTest {
    @Test(dataProvider = "data")
    public void testCase(double number1,double number2 , double expectedResult){
        Assert.assertEquals(Calculator.add(number1,number2),expectedResult,0.005);

    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {5,7,12},
                {2.4,5.3,7.7},
                {5,-2,3},
                {-5.4,2.6,-2.8},
                {-5.8,0,-5.8}
        };
    }




}
