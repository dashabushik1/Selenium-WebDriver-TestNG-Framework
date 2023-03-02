package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends BasePage {
    private final By logOutButton = By.id("submit");

    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    public void clickLogOut() {
        waitElementIsVisible(driver.findElement(logOutButton));
        driver.findElement(logOutButton).click();
        logger.info("Log out was successful.");
    }
}
