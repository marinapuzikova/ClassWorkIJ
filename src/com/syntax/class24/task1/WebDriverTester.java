package com.syntax.class24.task1;

public class WebDriverTester {
    public static void main(String[] args) {
       /* WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.closeBrowser();
        chromeDriver.findElement();
        chromeDriver.maximizeWindow();
        chromeDriver.openBrowser();
        WebDriver fireFox = new FireFoxDriver();
        fireFox.openBrowser();
        fireFox.closeBrowser();
        fireFox.maximizeWindow();
        fireFox.findElement();
        }
        */

        WebDriver[] webDrivers = {new ChromeDriver(), new FireFoxDriver()};
        for (WebDriver wb : webDrivers) {
            wb.openBrowser();
            wb.closeBrowser();
            wb.maximizeWindow();
            wb.findElement();
        }
    }
}
