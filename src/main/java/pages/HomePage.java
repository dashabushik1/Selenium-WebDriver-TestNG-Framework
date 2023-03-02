package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    private final By loginButton = By.id("login");
    private final By booksWrapper = By.xpath("//div[@class='rt-tbody']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        waitElementIsVisible(driver.findElement(loginButton));
        driver.findElement(loginButton).click();
        logger.info("Login page was opened.");
    }

    public boolean areBooksMatch(List<String> booksFromApi) {
        List<WebElement> uiBooks = driver.findElements(booksWrapper);
        for (String book : booksFromApi) {
            if (uiBooks.contains(book)) {
                return true;
            }
            logger.info("Books are matched.");
        }
        return false;
    }
}
