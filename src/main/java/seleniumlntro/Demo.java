package seleniumlntro;


import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.time.Duration;

public class Demo {

    @Test
    public void testNambaFoodTitle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nambafood.kg/?language=ru");
        System.out.println(driver.getTitle());

        String expectedTitle = "Namba Food — круглосуточная служба доставки №1 в Бишкеке";
        Assertions.assertEquals(expectedTitle,driver.getTitle());

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void testGoogleSearch(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");

        WebElement searchInputFiled = driver.findElement(By.name("q"));

        searchInputFiled.sendKeys("Iphone");
        searchInputFiled.sendKeys(Keys.ENTER);

        driver.close();

    }
}
