package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    private final By loginButton = By.id("login");
    private final By booksWrapper = By.xpath("//span[contains(@id, 'see-book')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        waitElementIsVisible(driver.findElement(loginButton));
        driver.findElement(loginButton).click();
        logger.info("Login page was opened.");
    }

    public boolean findIfAllApiAndUiBooksMatch(List<String> booksFromApi) {
        List<String> bookNames = driver.findElements(booksWrapper).stream().map(WebElement::getText).toList();
        for (String bookName : booksFromApi) {
            if (!bookNames.contains(bookName)) {
                return false;
            }
        }
        logger.info("Books are matched.");
        return true;
    }
}
