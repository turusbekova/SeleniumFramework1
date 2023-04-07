package practiceForm;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;

    MyChromeDriver myChromeDriver = new MyChromeDriver();

    public RegistrationPage registrationPage;

    @BeforeEach
    public void setUp(){
        driver = myChromeDriver.open();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        registrationPage = new RegistrationPage(driver,wait);
    }


}
