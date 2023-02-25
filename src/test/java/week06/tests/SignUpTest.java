package week06.tests;

import org.testng.annotations.Test;
import utilities.Driver;
import week06.pages.SignUpPage;

public class SignUpTest {
    SignUpPage pageObject =new SignUpPage();
    @Test
    public void test1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");
        pageObject.nameInput.sendKeys("John");
        pageObject.emailInput.sendKeys("abc@abc.com");
        pageObject.btn.click();
    }
}
