package week02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
/*
        driver.get("https://www.google.com");
        Thread.sleep(1000);

        driver.get("https://www.cydeo.com");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.navigate().to("https://www.ebay.com");

 */
        driver.navigate().to("https://www.abc.com");
        String actualTitle= driver.getTitle();
        String expectedTitle ="ABC Home Page - ABC.com";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title test is passed");
        }else{
            System.out.println("Title test is failed");
        }

        String actualUrl= driver.getCurrentUrl();
        System.out.println(actualUrl);
        String expectedUrl="https://abc.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL test is passed");
        }else{
            System.out.println("URL test is failed");

        }
        driver.close();
    }

}
