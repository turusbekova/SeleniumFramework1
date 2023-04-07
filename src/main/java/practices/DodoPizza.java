package practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DodoPizza {
    WebDriver driver;
    Actions action;

    @BeforeEach
    public void doDoTesting(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dodopizza.kg/bishkek/ala-archa?gclid=Cj0KCQjwlK-WBhDjARIsAO2sErTnMuVxX15YN16IQMZPFVS3sLMIqPegYqXyxEtaIZ4I34cfOzO7244aAhduEALw_wcB");
        action = new Actions(driver);
    }

    @Test
    public void testDoDo() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//input[@data-testid='checkout-form__phone-input']")).sendKeys("772446822");
        driver.findElement(By.xpath("//button[@class='sc-91ilwk-0 iaMCBy submit-button']")).click();
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
        driver.findElement(By.xpath("//input[@data-testid='profile__name-input']")).sendKeys("Begimai");
        driver.findElement(By.xpath("//div[@class='select__control']")).click();
        driver.findElement(By.xpath("//span[@data-value='11']")).click();
        driver.findElement(By.xpath("(//div[@class='select__control'])[2]")).click();
        driver.findElement(By.xpath("//span[@data-text='Мая']")).click();
        driver.findElement(By.xpath("//input[@data-testid='profile__email-input']")).sendKeys("asankadyrova11@gmail.com");
        driver.findElement(By.xpath("//input[@name='check_receiveSms']")).click();
        Thread.sleep(5000);
    }
}
