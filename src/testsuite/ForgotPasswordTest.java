package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // Click on the 'Forgot your password' link
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//p[text() = 'Forgot your password? ']"));
        forgotPasswordLink.click();

        // Verify the text 'Reset Password'
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();
        Assert.assertEquals("Failed to navigate to Reset Password page", expectedText, actualText);

        // Click on the 'Cancel' button
        WebElement cancelButton = driver.findElement(By.xpath("//button[text()=' Cancel ']"));
        cancelButton.click();

        // Verify the text 'Login'
        String expectedLoginText = "Login";
        String actualLoginText = driver.findElement(By.xpath("//h5[contain(text()), 'Login']")).getText();
        Assert.assertEquals("Failed to return to Login page", expectedLoginText, actualLoginText);
    }
}
