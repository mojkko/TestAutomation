package webAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    protected WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HegedusMojmir\\Selenium_Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        return new ChromeDriver();
    }

}