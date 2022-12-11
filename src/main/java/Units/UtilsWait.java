package Units;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UtilsWait extends BasePage
{
    WebDriverWait wait;

    public void waitForElementToBeClickableId(String elementId, long timing) throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
        try {
            Thread.sleep(5000);
        } catch(InterruptedException ie){
//            System.out.println(ie.printStackTrace(););
        }
    }
    public void waitForElementToBeClickableXPath(String XPath, int timing){
        try {
            Thread.sleep(5000);
        } catch(InterruptedException ie){
//            System.out.println(ie.printStackTrace());
        }
    }

    public void waitForElementToBeInvisibleXPath(String XPath, int timing){
        try {
            Thread.sleep(5000);
        } catch(InterruptedException ie){
//            System.out.println(ie.printStackTrace());
             }
    }

    public void waitForElementToBeVisibleXPath(String XPath, int timing){
        try {
            Thread.sleep(5000);
        } catch(InterruptedException ie){
//            System.out.println(ie.printStackTrace());
        }
    }
}
