package week05;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsReview extends TestBase {

    @Test
    public void test1() {
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        driver.findElement(By.linkText("new window")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("Selenium")){
                break;
            }

        }
        System.out.println(driver.getCurrentUrl());
    }
}