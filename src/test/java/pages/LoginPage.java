package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class LoginPage {
    private final WebDriver driver;
    // Locators
    private final By searchBox = By.name("q");


    // Constructor (Driver injected by PicoContainer)
    public LoginPage( ) {
        this.driver = DriverFactory.getDriver();
    }

    public void openHomePage() {
        driver.get("https://www.google.com");
    }

    public void searchFor(String text) {
        driver.findElement(searchBox).sendKeys(text);
        driver.findElement(searchBox).submit();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
