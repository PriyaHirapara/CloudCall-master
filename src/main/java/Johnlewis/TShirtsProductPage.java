package Johnlewis;

import Units.Elements;
import Units.UtilsAssert;
import Units.UtilsWait;
import org.openqa.selenium.JavascriptExecutor;

public class TShirtsProductPage extends BasketPage
{
    Elements elements;
    UtilsWait utilsWait;
    UtilsAssert utilsAssert;

    private  String actualProductNameTextValue ="//div[@class=\"xs-up\"]/h1";
    private String productSizeXS ="//button[@data-size=\"XS\"]";
    private String productSizeS ="//button[@data-size=\"S\"]";
    private String productSizeM ="//button[@data-size=\"M\"]";
    private String productSizeL ="//button[@data-size=\"L\"]";
    private String productSizeXL ="//button[@data-size=\"XL\"]";
    private String productSizeXXL ="//button[@data-size=\"XXL\"]";
    private String addToBasketButton ="//button[@id=\"add-to-basket-button\"]";


    public void toVerifyTShirtProduct(String expectedProductName)
    {
        elements = new Elements();
        utilsWait = new UtilsWait();
        utilsAssert = new UtilsAssert();
        utilsWait.waitForElementToBeVisibleXPath(actualProductNameTextValue,20);
        String actualMessageValue = elements.element_XPath(actualProductNameTextValue).getText();
       // utilsAssert.verifyActualAndExpected(expectedProductName,actualMessageValue);
    }

    // This method is for select product size
    public void selectProductSize(String productSize)
    {
        if (productSize.equalsIgnoreCase("XS"))
        {
            elements = new Elements();
            utilsWait = new UtilsWait();
            utilsWait.waitForElementToBeClickableXPath(productSizeXS,20);
            elements.elementClickByXPath(productSizeXS);

        }else if(productSize.equalsIgnoreCase("s"))
        {
            elements = new Elements();
            utilsWait = new UtilsWait();
            utilsWait.waitForElementToBeClickableXPath(productSizeS,20);
            elements.elementClickByXPath(productSizeS);

        }else if(productSize.equalsIgnoreCase("M"))
        {
            elements = new Elements();
            utilsWait = new UtilsWait();
            utilsWait.waitForElementToBeClickableXPath(productSizeM,20);
            elements.elementClickByXPath(productSizeM);

        }else if(productSize.equalsIgnoreCase("L"))
        {
            elements = new Elements();
            utilsWait = new UtilsWait();
            utilsWait.waitForElementToBeClickableXPath(productSizeL,20);
            elements.elementClickByXPath(productSizeL);

        }else if(productSize.equalsIgnoreCase("XL"))
        {
            elements = new Elements();
            utilsWait = new UtilsWait();
            utilsWait.waitForElementToBeClickableXPath(productSizeXL,20);
            elements.elementClickByXPath(productSizeXL);

        }else if(productSize.equalsIgnoreCase("XXL")){

            elements = new Elements();
            utilsWait = new UtilsWait();
            utilsWait.waitForElementToBeClickableXPath(productSizeXXL,20);
            elements.elementClickByXPath(productSizeXXL);

        }else {

            System.out.println("Please select size");
        }
    }

    // This product include page scroll
    public void clickOnAddToBasketButton()
    {
        elements = new Elements();
        utilsWait = new UtilsWait();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        utilsWait.waitForElementToBeClickableXPath(addToBasketButton,20);
        elements.elementClickByXPath(addToBasketButton);
    }

}
