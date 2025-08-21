package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;
    public static WebDriver initDriver(){
        String browser = ConfigReader.getProperty("browser");
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver(){
        if(driver == null){
                throw new IllegalStateException("Driver not initialized! Call initDriver() first.");
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
