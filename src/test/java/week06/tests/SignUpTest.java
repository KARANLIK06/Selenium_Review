package week06.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import week06.pages.ConfirmationPage;
import week06.pages.SignUpPage;

public class SignUpTest {
    ConfirmationPage confirmationPage= new ConfirmationPage();
    SignUpPage signUpPage =new SignUpPage();
    @Test
    public void test1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");
        //signUpPage.nameInput.sendKeys("John");
        //signUpPage.emailInput.sendKeys("abc@abc.com");
        //signUpPage.btn.click();
        signUpPage.login("John","abc@abc.com");

        String actualText=confirmationPage.text.getText();
        String expectedText="Thank you for signing up. Click the button below to return to the home page.";
        Assert.assertEquals(actualText,expectedText);
        Driver.closeDriver();
    }
}
