import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogOutPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void isLoginSuccessful() throws InterruptedException {
        home = new HomePage(driver);
        login = new LoginPage(driver);
        logOut = new LogOutPage(driver);

        home.clickLoginButton();

        login.enterUsername("Test1");
        login.enterPassword("Password!1");

        login.clickLogin();
        Thread.sleep(3000);

        logOut.clickLogOut();
    }
}