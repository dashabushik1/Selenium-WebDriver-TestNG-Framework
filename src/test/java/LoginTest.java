import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogOutPage;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoqa.com/books");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void isLoginSuccessful() throws InterruptedException {
        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        LogOutPage dashboard = new LogOutPage(driver);

        home.clickLoginButton();

        login.enterUsername("Test1");
        login.enterPassword("Password!1");

        login.clickLogin();
        Thread.sleep(3000);

        System.out.println("The page heading is --- " + dashboard.getHeading());

        dashboard.clickLogout();

        driver.quit();
    }


//    @Test
//    public void loginSuccessful() {
//        RestAssured.baseURI = "https://demoqa.com/swagger/";
//        RequestSpecification request = RestAssured.given();
//
//        JSONObject requestParams = new JSONObject();
//        requestParams.put("UserName", "Test-01");
//        requestParams.put("Password", "Password!1");
//
//        request.body(requestParams.toString());
//        Response response = request.post("/Account/v1/User");
//
//        Assert.assertEquals(response.getStatusCode(), 201);
//        String userID = response.getBody().jsonPath().getString("userID");
//    }
}