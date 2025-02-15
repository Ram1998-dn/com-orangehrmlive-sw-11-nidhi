package browserfactory;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Create the package ‘browserfactory’ and create the
 * class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup
 * code inside the class ‘Base Test’.
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 */
public class BaseTest {

    public static WebDriver driver;


    // Method to initialize the WebDriver for the specified browser.


    public void openBrowser(String baseUrl){

        // Set Chrome options (you can modify this if needed, like headless mode)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");// Start browser maximized

        // Initialize the driver
        driver = new ChromeDriver();
        driver.get(baseUrl);
        // Maximize the window
        driver.manage().window().maximize();
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser(){
        driver.quit();

    }
}
