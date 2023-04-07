package advacedLocators;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathDemo {
    WebDriver driver;

    @BeforeEach
    public  void  setUp(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Asan");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("asan@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Bishkek123");
        driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]")).sendKeys("Karakol3922");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.findElement(By.xpath("//p"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

    @Test
    public void testing(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");






        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }


}
