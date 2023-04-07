package practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Instagram {
    WebDriver driver;
    Actions action;

    @BeforeEach
    public void instagramTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.instagram.com/");
        action = new Actions(driver);
    }

    @Test
    public void test() throws InterruptedException{
        driver.findElement(By.xpath("//input[@aria-label='Телефон, имя пользователя или эл. адрес']")).sendKeys("asankadyrova_b");
        driver.findElement(By.xpath("//input[@aria-label='Пароль']")).sendKeys("Begimai777");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

            Thread.sleep(5000);




    }
}
