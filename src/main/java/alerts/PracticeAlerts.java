package alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticeAlerts {

     WebDriver driver;

     @BeforeEach
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }

        @Test
        public void testSimpleAlert() throws InterruptedException {
            driver.navigate().to("https://demoqa.com/alerts");
            WebElement alertButton = driver.findElement(By.id("alertButton"));
            alertButton.click();

            Thread.sleep(5000);

            Alert alert = driver.switchTo().alert();

            alert.accept();
            Thread.sleep(5000);
        }


        @Test
        public void testSimpleAlert2() throws InterruptedException {
            driver.navigate().to("https://demoqa.com/alerts");
            driver.findElement(By.id("confirmButton")).click();

            Alert alert = driver.switchTo().alert();
            Thread.sleep(5000);
            alert.dismiss();
            Thread.sleep(5000);

        }


        @AfterEach
        public void closeBrowser() {
            driver.close();
        }
    }

