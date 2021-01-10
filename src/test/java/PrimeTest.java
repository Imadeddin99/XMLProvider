import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeTest {
    @Test(dataProvider = "data")
    public void testCase(int number1 , boolean expectedResult){
        Assert.assertEquals(Calculator.isPrime(number1),expectedResult);

    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return new Object[][] {
                {5,true},
                {2,true},
                {12,false},
                {1,false},
                {0,false},
                {-5,false}
        };
    }

}
