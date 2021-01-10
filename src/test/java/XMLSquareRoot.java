import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLSquareRoot {
    @Test(timeOut = 100)
    @Parameters({"number1","expectedResult"})
    public void testCase(double number1 , double expectedResult){
        Assert.assertEquals(Calculator.squareRoot(number1),
                expectedResult,
                0.005);

    }
    @Test(timeOut = 100,expectedExceptions = ArithmeticException.class)
    public void testNegative(){
        double  result= Calculator.squareRoot(-10);
    }
}
