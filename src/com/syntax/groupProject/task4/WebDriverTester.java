package com.syntax.groupProject.task4;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[]webdriver={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(RemoteWebDriver web:webdriver){
            web.open();
            web.close();
            web.getTitle();
            web.getScreenshot();
            web.navigate();
        }
    }
}
