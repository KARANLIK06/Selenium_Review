package week06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import week05.TestBase;

    public class UploadTest extends TestBase {

        @Test
        public void test1() throws InterruptedException {
            driver.get("https://chercher.tech/practice/" +
                    "practice-pop-ups-selenium-webdriver");

            String path = "C:\\Users\\user\\IdeaProjects\\EU10_Selenium_Review\\src\\test\\java\\week06\\test document.txt";
            WebElement uploadLink = driver.findElement(By.name("upload"));
            uploadLink.sendKeys(path);
            Thread.sleep(3000);

        }
    }


