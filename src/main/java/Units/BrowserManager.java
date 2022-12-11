package Units;

import org.example.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage
{
    public static LoadProperty loadProperty = new LoadProperty();
    public static String BrowserName = loadProperty.getProperty("BrowserName");

    public void setBrowser()
    {
        if (BrowserName.equalsIgnoreCase("chrome"))
        {
           // WebDriverManager
            System.setProperty("webdriver.chrome.driver","BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();

        }else if (BrowserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();

        }else if(BrowserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","");
            driver = new EdgeDriver();
        } else
        {
            System.out.println("Please provide correct Driver name");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(loadProperty.getProperty("Url"));

    }

    // This method included with clear all Cookies at the end of test
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
