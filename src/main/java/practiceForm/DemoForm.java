package practiceForm;

import org.junit.jupiter.api.Test;

public class DemoForm extends BaseTest{

    @Test
    public  void test1 (){
        driver.get(Constant.DEV_ENV);
        registrationPage.enterFirstName("Baha");
        registrationPage.lastName("asankadyrov");
        registrationPage.emailName("baha@mail.ru");
    }

}
