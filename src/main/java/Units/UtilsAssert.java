package Units;

import org.junit.Assert;

public class UtilsAssert extends BasePage
{

    public void verifyActualAndExpected(String expected, String actual){
        Assert.assertEquals(expected,actual);
    }
}
