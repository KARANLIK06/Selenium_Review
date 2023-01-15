package week03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
    public static void main(String[] args) {

        //TC #1: Etsy Title Verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.etsy.com/
        driver.get("https://www.etsy.com/");

        // 3. Search for “wooden spoon”
        WebElement searchBar = driver.findElement(By.id("global-enhancements-search-query"));
        searchBar.sendKeys("Wooden Spoon"+ Keys.ENTER);

       // WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
       // button.click();

        //4. Verify title:  Expected: “Wooden spoon | Etsy”
        String title = driver.getTitle();

        if(title.equals("Wooden spoon - Etsy")){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }


    }
}
