package log;

import base.BaseTests;
import org.testng.annotations.Test;
import page.Login;

public class LoginTests extends BaseTests {

    @Test
    public void loginChecker() {
        Login loginPage = homePage.clickLogin();
        loginPage.setCredentials("aaagmail.com", "pass");
        loginPage.clickSubmit();
    }
}
