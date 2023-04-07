package practiceForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

    WebDriver driver;
    WebDriverWait wait;

    public Methods(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement element (By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void senKeys (By locator,String str){
        element(locator).sendKeys(str);
    }


}
