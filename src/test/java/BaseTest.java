import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LogOutPage;
import pages.LoginPage;

public class BaseTest {
    WebDriver driver;
    HomePage home;
    LoginPage login;
    LogOutPage logOut;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
