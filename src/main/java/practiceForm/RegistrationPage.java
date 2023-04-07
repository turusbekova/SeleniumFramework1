package practiceForm;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends Methods {

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    By firstNameLocator = By.xpath("//input[@id='firstName']");
    By lastNameLocator = By.xpath("//input[@id='lastName']");
    By emailLocator = By.xpath("//input[@id='userEmail']");
    By maleGenderButton = By.xpath("//input[@id='gender-radio-1']");
    By femaleGenderButton = By.xpath("//input[@id='gender-radio-2']");
    By otherGenderButton = By.xpath("//input[@id='gender-radio-3']");
    By mobileNumberButton = By.xpath("//input[@id='userNumber']");
    By dateField = By.xpath("//input[@id='dateOfBirthInput']");




    public void enterFirstName (String userName){
        senKeys(firstNameLocator,userName);

    }
    public void lastName  (String lastName){
        senKeys(lastNameLocator,lastName);
    }

    public void emailName (String email){
        senKeys(emailLocator,email);

    }

    public void  setMaleGenderButton (String click){
        senKeys(maleGenderButton,click);
        WebElement newTab = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
        newTab.click();
    }

}



