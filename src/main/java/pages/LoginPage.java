package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By loginButton = By.id("login");
    private final By userName = By.id("UserName");
    private final By password = By.id("password");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String user) {
        waitElementIsVisible(driver.findElement(userName));
        driver.findElement(userName).sendKeys(user);
        logger.info("Email has been entered.");
    }

    public void enterPassword(String pass) {
        waitElementIsVisible(driver.findElement(password));
        driver.findElement(password).sendKeys(pass);
        logger.info("Password has been entered.");
    }

    public void clickLogin() {
        waitElementIsVisible(driver.findElement(loginButton));
        driver.findElement(loginButton).click();
        logger.info("Profile page was opened.");
    }
}