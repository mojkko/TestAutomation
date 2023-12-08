package webAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends Base {

    public void googleSearch() {
        
        // Get the WebDriver object from the Base class
        WebDriver driver = getDriver();
        
        // Go to google home page
        driver.get("https://www.google.com");
        
        // Call the method to accept all cookies on the page 
        acceptAllCookies(driver);

        // Find the search input field by its 'name' attribute
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter search term "Active sync" into input field
        searchBox.sendKeys("Active sync");

        // Submit the search form
        searchBox.submit();

        // Find and click on the first search result link, assuming it's represented by an h3 element
        WebElement firstLink = driver.findElement(By.cssSelector("h3"));
        firstLink.click();

    // Private method to handle accepting all coockies 
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
