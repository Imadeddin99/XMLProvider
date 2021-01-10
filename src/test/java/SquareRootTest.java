import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareRootTest {
    @Test(dataProvider = "data",timeOut = 1000)
    public void testCase(double number1 , double expectedResult){
        Assert.assertEquals(Calculator.squareRoot(number1),expectedResult,0.007);

    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {25,5},
                {2.4,1.549},
                {0.0,0.0}
        };
    }
@Test(timeOut = 1000,expectedExceptions = ArithmeticException.class)
    public void testNegative(){
       double  result= Calculator.squareRoot(-10);
}




}
