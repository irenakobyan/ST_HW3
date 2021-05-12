package pages;

import org.junit.Test;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class test_dreams {
    public static void main(String[] args) {
        tester();
    }

    @Test
    public static void tester() {
        System.setProperty("webdriver.chrome.driver", "C://Users//User//Desktop//Spring 2021//Software Testing//IdeaProjects//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dreamslab.am");
        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/nav[1]/div[3]/a[1]"));
        login.click();

        WebElement username = driver.findElement(By.id("login-email"));
        username.sendKeys("abcd@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("blahblah");

        WebElement btn = driver.findElement(By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]"));
        btn.click();

        WebElement text = driver.findElement(By.xpath("//a[contains(text(),'մոռացե՞լ եք ծածկագիրը')]"));
        System.out.println("Text is "+ text.getText());

        driver.quit();
    }

}