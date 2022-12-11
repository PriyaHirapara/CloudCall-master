package Johnlewis;

import Units.BasePage;
import Units.Elements;
import Units.UtilsAssert;
import Units.UtilsWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage
{
    Elements elements;
    UtilsWait utilsWait;
    UtilsAssert utilsAssert;

    private String expectedHomePageUrl = "https://www.johnlewis.com/";
    private String acceptAllCookies = "//button[contains(text(),'Allow all')]";
    private String tShirtsLinkText = "T-Shirts";
    private String shoppingBasket ="//a[@id=\"minibasket-icon-anchor\"]";


    public void validateJohnLewisHomePage()
    {
        utilsWait = new UtilsWait();
        utilsAssert = new UtilsAssert();
        utilsWait.waitForElementToBeClickableXPath(acceptAllCookies,20);
        String actualUrlValue = driver.getCurrentUrl();
        utilsAssert.verifyActualAndExpected(expectedHomePageUrl,actualUrlValue);
        System.out.println("JohnLewis Home page loaded successfully.");

    }

    public void clickAcceptAllCookies()
    {
        elements = new Elements();
        utilsWait = new UtilsWait();
        elements.elementClickByXPath(acceptAllCookies);
        utilsWait.waitForElementToBeInvisibleXPath(acceptAllCookies,20);
    }

    public void clickOnShoppingBasket()
    {
        elements = new Elements();
        utilsWait = new UtilsWait();
        utilsWait.waitForElementToBeClickableXPath(shoppingBasket,60);
        elements.elementClickByXPath(shoppingBasket);
    }

    // This method is mouseHover on Men Button on header menu and clicking on TShirts option
    public void clickOnTShirts()
    {
        elements = new Elements();
        WebElement menHomePageHeader = driver.findElement(By.linkText("Men"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menHomePageHeader).perform();
        elements.
                elementClickByLinkText(tShirtsLinkText);
    }

}
