package advancedMouseInteractions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Practice {

    WebDriver driver;
    Actions actions;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        actions = new Actions(driver);
    }

    @Test
    public void test() throws InterruptedException {
        WebElement home = driver.findElement(By.xpath("//button[@aria-label = 'Toggle']"));
        home.click();

        WebElement download = driver.findElement(By.xpath("(//button[@aria-label = 'Toggle'])[4]"));
        download.click();

        WebElement checkBox = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[6]"));
        checkBox.click();
        Thread.sleep(5000);



    }

}
