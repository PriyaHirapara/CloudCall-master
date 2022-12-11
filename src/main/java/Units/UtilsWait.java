package Units;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilsWait extends BasePage
{
    WebDriverWait wait;

    public void waitForElementToBeClickableId(String Id, int timing){
        wait=new WebDriverWait(driver, timing);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(Id)));
    }
    public void waitForElementToBeClickableXPath(String XPath, int timing){
        wait=new WebDriverWait(driver, timing);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPath)));
    }

    public void waitForElementToBeInvisibleXPath(String XPath, int timing){
        wait=new WebDriverWait(driver,timing);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(XPath)));
    }

    public void waitForElementToBeVisibleXPath(String XPath, int timing){
        wait=new WebDriverWait(driver,timing);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(XPath)));
    }
}
