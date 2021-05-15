package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recover {
    private WebDriver driver;
    private By sendCode = By.xpath("//input[@id='forgot-email']");
    private By submit =  By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[2]/button[1]");

    public Recover(WebDriver driver){

        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(sendCode).sendKeys(email);
    }

    public void sendEmail(){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(submit)));
        driver.findElement(submit).click();
    }

    public String getURL(){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.urlToBe("https://dreamslab.am/home"));
        return driver.getCurrentUrl();
    }
}
