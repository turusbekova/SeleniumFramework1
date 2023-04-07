package basicLocations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicLocators {


    @Test
    public void findByIdTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement fullnameImpudFild = driver.findElement(By.id("userName"));
        fullnameImpudFild.sendKeys("Baha");

        WebElement emailImpudFild = driver.findElement(By.id("userEmail"));
        emailImpudFild.sendKeys("baha@mail.ru");

        WebElement currenAdress = driver.findElement(By.id("currentAddress"));
        currenAdress.sendKeys("bishkek312");

        WebElement permanentImpudFild = driver.findElement(By.id("permanentAddress"));
        permanentImpudFild.sendKeys("karakol");

        WebElement submitBattone = driver.findElement(By.id("submit"));
        submitBattone.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }
}
