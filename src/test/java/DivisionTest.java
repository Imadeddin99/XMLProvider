import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ExpectedExceptionsAnnotation;

public class DivisionTest {
    @Test(dataProvider = "data")
    public void testCase(double number1,double number2 , double expectedResult){
        Assert.assertEquals(Calculator.divide(number1,number2),expectedResult,0.005);

    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {5,7,0.714},
                {2.4,5.3,0.452},
                {5,-2,-2.5},
                {-5.4,2.6,-2.076}
        };
    }


    @Test(expectedExceptions=ArithmeticException.class)
    public void testException(){
        int number1 =10;
        int number2=0;
        int number3=number1/number2;
    }


}
