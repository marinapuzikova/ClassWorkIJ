package com.syntax.groupProject.task4;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends TakesScreenshot,WebDriver{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opens Chrome");

    }

    @Override
    public void close() {
        System.out.println("Closes Chrome");

    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome takes Screenshots");
    }

    @Override
    public void navigate() {
        System.out.println("Chrome Navigates");
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("FireFox opens");
    }

    @Override
    public void close() {
        System.out.println("FireFox closes");
    }

    @Override
    public String getTitle() {
        return "FireFox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("FireFox takes ScreenShots ");
    }

    @Override
    public void navigate() {
        System.out.println("FireFox navigates");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Safari opens");

    }

    @Override
    public void close() {
        System.out.println("Safari closes");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari takes ScreenShots");
    }

    @Override
    public void navigate() {
        System.out.println("Safari navigates");
    }
}