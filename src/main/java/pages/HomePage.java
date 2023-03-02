package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By loginButton = By.id("login");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        waitElementIsVisible(driver.findElement(loginButton));
        driver.findElement(loginButton).click();
        logger.info("Login page was opened.");
    }
}
