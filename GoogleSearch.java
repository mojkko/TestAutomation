package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends Base {

    public void googleSearch() {
        // Get the WebDriver object from the Base class
        WebDriver driver = getDriver();

        driver.get("https://www.google.com");

        acceptAllCookies(driver);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Active sync");
        searchBox.submit();

        WebElement firstLink = driver.findElement(By.cssSelector("h3"));
        firstLink.click();


    }
    private void acceptAllCookies(WebDriver driver) {
        try {
            // Assuming the "Accept All" button has an ID attribute, replace it accordingly
            WebElement acceptAllButton = driver.findElement(By.id("L2AGLb"));

            // Perform the click action
            acceptAllButton.click();
        } catch (Exception e) {
            // Handle exception if the "Accept All" button is not found or clickable
            System.out.println("Unable to accept cookies: " + e.getMessage());
        }
    }
}