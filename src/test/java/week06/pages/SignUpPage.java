package week06.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpPage {
    //Alt+Insert
    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name = 'email']")
    public WebElement emailInput;
    @FindBy(xpath = "//button[@name = 'wooden_spoon']")
    public WebElement btn;

    public void login(String username,String email){
        nameInput.sendKeys("John");
        emailInput.sendKeys("abc@abc.com");
        btn.click();
    }
}
