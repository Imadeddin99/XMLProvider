import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLDivision {
    @Test()
    @Parameters({"number1","number2","expectedResult"})
    public void testCase(double number1,double number2 , double expectedResult){
        Assert.assertEquals(Calculator.divide(number1,number2),
                expectedResult,
                0.005);

    }

    @Test(expectedExceptions=ArithmeticException.class)
    public void testException(){
        int number1 =10;
        int number2=0;
        int number3=number1/number2;
    }
}
