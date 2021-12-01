package com.syntax.class24.task1;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Chrome opens Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome closes Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome maximizes Window");

    }

    @Override
    public void findElement() {
        System.out.println("Chrome finds element");

    }

}

class FireFoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("FireFox opens FireFox browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox closes FireFox browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox maximizes Window");

    }

    @Override
    public void findElement() {
        System.out.println("Firefox finds element");

    }
}
