package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends BasePage {
    private final By heading = By.xpath("//div[@class=\"main-header\"]");
    private final By logOutButton = By.id("submit");


    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    public String getHeading() {
        String head = driver.findElement(heading).getText();
        return head;
    }

    public void clickLogout() {
        driver.findElement(logOutButton).click();
    }
}
