package week04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");


        // why findElements() is returning empty list if no match?
        // because when we call the method, it will creat an empty list first,
        // then to find the web elements. if there are no matches, then the list
        // will be keep empty.

        List<WebElement> links = driver.findElements(By.xpath("//li[@class='list-group-item']"));
        System.out.println(links.get(1).getText());
        System.out.println(links.size());

    }
}
