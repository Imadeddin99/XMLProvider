import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLAdditionTest {
    @Test()
    @Parameters({"number1","number2","expectedResult"})
    public void testCase(double number1,double number2 , double expectedResult){
        Assert.assertEquals(Calculator.add(number1,number2),
                expectedResult,
                0.005);

    }




}
