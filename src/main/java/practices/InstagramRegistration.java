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

public class InstagramRegistration {
    WebDriver driver;
    Actions action;

    @BeforeEach
    public void registrationTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        action = new Actions(driver);
    }
    @Test
    public void test()  {
        driver.findElement(By.xpath("//span[@class='_7UhW9   xLCgt        qyrsm      gtFbE       se6yk        ']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Моб. телефон или эл. адрес']")).sendKeys("asankadyrova11@gmail.com");
        driver.findElement(By.xpath("//input[@aria-label='Имя и фамилия']")).sendKeys("Бегимай Турусбекова");
        driver.findElement(By.xpath("//input[@aria-label='Имя пользователя']")).sendKeys("asankadyrova_b");
        driver.findElement(By.xpath("//input[@aria-label='Пароль']")).sendKeys("1234567");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }
}
