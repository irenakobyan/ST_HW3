import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_dreams {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C://Users//User//IdeaProjects//chromedriver.exe");

            ChromeDriver driver = new ChromeDriver();
            driver.get("https://dreamslab.am/home/login");
            driver.manage().window().maximize();
            driver.findElement(By.id("login-email")).sendKeys("login");
            driver.findElement(By.name("password")).sendKeys("password");
            driver.findElement(By.className("btn")).click();


    }

}
