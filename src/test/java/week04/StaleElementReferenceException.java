package week04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));

        System.out.println(gmail.getText());

        driver.navigate().refresh();
         gmail = driver.findElement(By.linkText("Gmail"));

        System.out.println(gmail.getText());
    }
}
