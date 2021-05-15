package recover;

import org.testng.annotations.Test;
import base.BaseTests;
import page.Recover;
import static org.testng.Assert.assertEquals;

public class RecoverTests extends BaseTests {
    @Test
    public void Sender(){
        Recover recoverPage = homePage.clickLogin().forgotPass();
        recoverPage.setEmail("badadada@dada.com");
        recoverPage.sendEmail();
        assertEquals(recoverPage.getURL(), "https://dreamslab.am/home");
    }
}
