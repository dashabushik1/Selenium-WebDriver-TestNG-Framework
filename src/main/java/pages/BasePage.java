package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected final Logger logger = LogManager.getRootLogger();
    private static final int SECONDS_OF_WAITING = 30;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(SECONDS_OF_WAITING)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}