package week03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CssLocators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // syntax of css
        // 1.tagName[attributeName='Value']

        driver.get("https://practice.cydeo.com/inputs");
        WebElement flash = driver.findElement(By.cssSelector("div[id='flash-messages']"));

        //2. second way of providing syntax, this one used only for id or className
        //tagName.classValue    or   tagName#id
        // if you use class value, you have to replace the space(if there is) with .


        // sometimes we need to locate one element then go to child element, this time, we have to use > sign
        // div.example>form
        // in the css, we can go from parent to child, but we CAN NOT go from child to parent.


        // using index number in Css locator
        // if we have more than one same type of elements, we can use indexing
        // css locator:nth-of-type(index number)  --> index number is starting from 1
        // select#state>option:nth-of-type(4)

    }
}
