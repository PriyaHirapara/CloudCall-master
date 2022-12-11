package StepDefinitions;

import Units.BasePage;
import Units.BrowserManager;
import io.cucumber.java.*;


public class Hooks
{
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser()
    {
        browserManager.setBrowser();
    }

    @After
    public void closeBrowser()
    {
        browserManager.closeBrowser();
    }
}
