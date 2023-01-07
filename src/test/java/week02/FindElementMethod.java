package week02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");
        /* 1. id
        WebElement foot = driver.findElement(By.id("page-footer"));
        System.out.println(foot.getText());
        System.out.println(foot.getTagName());
         */

        /*
        // 2. link text
        WebElement brokenLink=driver.findElement(By.linkText("Broken Images"));
        System.out.println(brokenLink.getText());
        brokenLink.click();
         */
        /*
         3. Partial link text
        WebElement checkBoxes=driver.findElement(By.partialLinkText("Check"));
        System.out.println(checkBoxes.getText());

        WebElement dynamicLoading = driver.findElement(By.partialLinkText("Dynamic"));
        System.out.println(dynamicLoading.getText());
         */

        /*
        // 4. name
        WebElement meta = driver.findElement(By.name("viewport"));
        System.out.println(meta.getTagName());
         */

        /*
        // 5. class name
        WebElement title = driver.findElement(By.className("h1"));
        System.out.println(title.getText());
         */
        // 6. tag name
        WebElement tagTitle = driver.findElement(By.tagName(""));
    }
}
