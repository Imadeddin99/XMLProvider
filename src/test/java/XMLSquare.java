import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLSquare {
    @Test()
    @Parameters({"number1","expectedResult"})
    public void testCase(double number1, double expectedResult){
        Assert.assertEquals(Calculator.squar(number1),
                expectedResult,
                0.005);

    }



}
