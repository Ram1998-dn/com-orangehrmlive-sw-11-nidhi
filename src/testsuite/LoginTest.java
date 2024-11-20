package testsuite;
/**
 * Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 *
 * Write down the following test in the ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials()
 * * Enter “Admin” username
 * * Enter “admin123" password
 * * Click on the ‘Login’ button
 * * Verify the ‘Dashboard’ text is displayed
 */

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials() {
            // Enter "Admin" username
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys("Admin");

            // Enter "admin123" password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("admin123");

            // Click on the 'Login' button
            WebElement loginButton = driver.findElement(By.xpath("//button[@type = 'submit' ]"));
            loginButton.click();

             //* Verify the ‘Dashboard’ text is displaye
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals("Dashboard text is not displayed", expectedText, actualText);
        }
    }



