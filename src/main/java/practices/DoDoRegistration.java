package practices;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoDoRegistration {
    WebDriver driver;
    Actions actions;

    @BeforeEach
    public void registrationInDoDo(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://dodopizza.kg/bishkek/profile?gclid=Cj0KCQjwlK-WBhDjARIsAO2sErTnMuVxX15YN16IQMZPFVS3sLMIqPegYqXyxEtaIZ4I34cfOzO7244aAhduEALw_wcB");
        actions = new Actions(driver);
    }

    @Test
    public void registrationTest() throws InterruptedException {
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
