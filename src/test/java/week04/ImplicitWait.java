package week04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dynamic_loading/4");

        WebElement text = driver.findElement(By.cssSelector("div#finish>h4"));
        System.out.println(text.getText());

    }
}
