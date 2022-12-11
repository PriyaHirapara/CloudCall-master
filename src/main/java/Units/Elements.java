package Units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Elements extends BasePage
{
    public WebElement element_ID(String Id)
    {
        return driver.findElement(By.id(Id));
    }

    public WebElement element_ClassName(String ClassName){return driver.findElement(By.className(ClassName));}

    public WebElement element_XPath(String XPath){return driver.findElement(By.xpath(XPath));}

    public WebElement element_LinkText(String LinkText){return driver.findElement(By.linkText(LinkText));}

    public WebElement element_CSSClass(String ClassName){return driver.findElement(By.cssSelector(ClassName));}

    public List<WebElement>elements_ListClassName(String ClassName){return driver.findElements(By.className(ClassName));}

    public List<WebElement>elements_ListXPath(String Xpath){return driver.findElements(By.xpath(Xpath));}

    public void elementClickByID(String Id){element_ID(Id).click();}

    public void elementClickByClassName(String ClassName){element_ClassName(ClassName).click();}

    public void elementClickByXPath(String XPath){element_XPath(XPath).click();}

    public void elementClickByLinkText(String LinkText){element_LinkText(LinkText).click();}

    public void elementSendKeysId(String Id, String text){
        element_ID(Id).sendKeys(text);
    }

    public void elementSendKeysClassName(String ClassName, String productQuantity){
        element_ClassName(ClassName).sendKeys(productQuantity);
    }

    public void listElementByXPath(String Xpath, int ProductNumber){elements_ListXPath(Xpath).get(ProductNumber).click();}

    public void getTextValueFromElementClassName(String ClassName){element_ClassName(ClassName).getText();}

    public void findElementByLinkText(String LinkText){element_LinkText(LinkText);}

}
