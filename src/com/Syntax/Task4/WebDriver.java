package com.Syntax.Task4;

public interface WebDriver {

    /*Task 4.
    Provide Implementation for the diagram below. Then
    create a test class in which you need to create Objects of
    ChromeDriver, FirefoxDrive and SafariDriver classes and
    see which methods available to them
    */

    void open();
    void close();
    String getTitle();
}

 interface RemoteWebDriver extends WebDriver {

    void navigate();
}

interface TakeScreenshot extends RemoteWebDriver{
     void GetScreenshot();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }

 class FireFoxDriver implements RemoteWebDriver{

     @Override
     public void open() {

     }

     @Override
     public void close() {

     }

     @Override
     public String getTitle() {
         return null;
     }

     @Override
     public void navigate() {

     }
 }

 class SafariDriver implements WebDriver{

     @Override
     public void open() {

     }

     @Override
     public void close() {

     }

     @Override
     public String getTitle() {
         return null;
     }
 }
}
