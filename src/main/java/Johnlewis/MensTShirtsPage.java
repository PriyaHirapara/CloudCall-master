package Johnlewis;

import Units.BasePage;
import Units.Elements;
import Units.UtilsAssert;
import Units.UtilsWait;
import org.openqa.selenium.JavascriptExecutor;

public class MensTShirtsPage extends BasePage
{
    Elements elements;
    UtilsWait utilsWait;
    UtilsAssert utilsAssert;

    private String expectedMensTShirtsText = "Men's T-Shirts";
    private String actualMensTShirtsText = "//li[contains(text(),\"Men's T-Shirts\")]";
    private String firstProductQuickViewButtons="//h2[@class=\"title_title__1MULs title_title--four-lines__VHzXP\"]";
    private  String productNameTextValue ="//div[@class=\"xs-up\"]/h1";

    public void toValidateMensTShirtsPage(){
        elements = new Elements();
        utilsWait = new UtilsWait();
        utilsAssert = new UtilsAssert();
        utilsWait.waitForElementToBeVisibleXPath(actualMensTShirtsText,20);
        String actualMensTShirtsTextValue = elements.element_XPath(actualMensTShirtsText).getText();
        utilsAssert.verifyActualAndExpected(expectedMensTShirtsText,actualMensTShirtsTextValue);
        System.out.println("I am Navigate to Men's T-Shirts page successfully");
    }

    // This product include page scroll
    public void clickOnFirstProduct(int ProductNumber)
    {
        elements = new Elements();
        utilsWait = new UtilsWait();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        utilsWait.waitForElementToBeClickableXPath(firstProductQuickViewButtons,60);
        elements.listElementByXPath(firstProductQuickViewButtons,ProductNumber);
        System.out.println("Product number:- " + ProductNumber);
        String expectedProductNameValue = elements.element_XPath(productNameTextValue).getText();
        System.out.println("Product name:- " + expectedProductNameValue);
    }


}
