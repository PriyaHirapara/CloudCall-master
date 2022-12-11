package Johnlewis;

import Units.BasePage;
import Units.Elements;
import Units.UtilsAssert;
import Units.UtilsWait;

public class BasketPage extends BasePage
{
    Elements elements;
    UtilsWait utilsWait;
    UtilsAssert utilsAssert;

    private String expectedEmptyShoppingBasketText ="Your basket is empty.";
    private String actualEmptyShoppingBasketText ="u-centred";
    private String actualFirstProductText ="//h2[@class=\"product-list-title\"]";
    private String inputProductQuantity ="//button[@class=\"quantity-increase-button\"]";
    private String actualFirstProductQuantity ="quantity-input";
    private String expectedFirstProductQuantity ="1";
    private String removeItem ="//button[@class=\"remove-basket-item-form-button\"]";


    public void toVerifyShoppingBasketIsEmpty(){
        elements = new Elements();
        utilsWait = new UtilsWait();
        utilsAssert = new UtilsAssert();
        String actualEmptyShoppingBasketTextValue = elements.element_ClassName(actualEmptyShoppingBasketText).getText();
        utilsAssert.verifyActualAndExpected(expectedEmptyShoppingBasketText,actualEmptyShoppingBasketTextValue);
    }

    public void toVerifyFirstProductInCart(String expectedProductNameAndSize)
    {
        elements = new Elements();
        utilsAssert = new UtilsAssert();
        utilsWait = new UtilsWait();
        utilsWait.waitForElementToBeVisibleXPath(actualFirstProductText, 40);
        String actualNameValueFirstProductText = elements.element_XPath(actualFirstProductText).getText();
        utilsAssert.verifyActualAndExpected(expectedProductNameAndSize, actualNameValueFirstProductText);
        String actualQuantityOfFirstProduct = elements.element_ClassName(actualFirstProductQuantity).getAttribute("value");
        System.out.println(actualNameValueFirstProductText + " :- " + actualQuantityOfFirstProduct);
        utilsAssert.verifyActualAndExpected((expectedFirstProductQuantity), actualQuantityOfFirstProduct);
    }

    // This method is increasing product quantity
    public void enterProductQuantity(int productQuantity)
    {
        elements = new Elements();
        for (int i = 1; i <= (productQuantity - 1); i++)
        {
            elements.elementClickByXPath(inputProductQuantity);
        }
    }

    public void toVerifyIncreasedProductQuantity(String expectedProductQuantity)
    {
        elements = new Elements();
        utilsAssert = new UtilsAssert();
        utilsWait = new UtilsWait();
        utilsWait.waitForElementToBeVisibleXPath(actualFirstProductText,20);
        String actualQuantityOfFirstProduct = elements.element_ClassName(actualFirstProductQuantity).getAttribute("value");
        utilsAssert.verifyActualAndExpected((expectedProductQuantity),actualQuantityOfFirstProduct);

    }

    public void clickOnRemoveItem(){
        elements = new Elements();
        elements.elementClickByXPath(removeItem);
    }
}
