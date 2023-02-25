package week06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConfirmationPage {
    public ConfirmationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "h3.subheader")
    public WebElement text;
}
