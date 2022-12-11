package org.example;

import Units.BasePage;
import Units.BrowserManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BasePage
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
