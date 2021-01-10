import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLPrime {
    @Test(timeOut = 100)
    @Parameters({"number1","expectedResult"})
    public void testCase(int number1, boolean expectedResult){
        Assert.assertEquals(Calculator.isPrime(number1),
                expectedResult);

    }
}
