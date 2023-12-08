package webAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Base class provides a WebDriver object for test classes to use
public class Base {
     // Returns a WebDriver object, which is assumed to be initialized elsewhere
    protected WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HegedusMojmir\\Selenium_Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // WebDriver is created here
        return new ChromeDriver();
    }

}
