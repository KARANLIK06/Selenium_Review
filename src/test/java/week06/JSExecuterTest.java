package week06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import week05.TestBase;

public class JSExecuterTest extends TestBase {
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",search);
        Thread.sleep(2000);

    }

    @Test
    public void test2(){


    }
}
