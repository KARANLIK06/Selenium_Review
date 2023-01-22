package week04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blutBtn = driver.findElement(By.id("blue"));
        WebElement blutText = driver.findElement(By.xpath("//label[.='Blue']"));
        WebElement redBtn = driver.findElement(By.id("red"));
        WebElement greenBtn = driver.findElement(By.id("green"));

        redBtn.click();
        Thread.sleep(2000);
        blutBtn.click();

//        System.out.println(redBtn.isDisplayed());  // true
//        System.out.println(redBtn.isSelected()); // false
//        System.out.println(redBtn.getText()); // red
//        System.out.println(redBtn.isEnabled()); // true
//        System.out.println(greenBtn.isEnabled());
        System.out.println(blutText.getText());

        List<WebElement> btns = driver.findElements(By.xpath("//input[@type='radio']"));

        for (WebElement btn : btns) {
            btn.click();
            Thread.sleep(1000);
            System.out.println(btn.isEnabled());

        }


    }
}
