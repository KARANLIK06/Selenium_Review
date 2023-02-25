package week06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import week05.TestBase;

import java.util.List;

public class TableTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://afd.calpoly.edu/web/sample-tables");
        WebElement address1 = driver.findElement(By.xpath("//td[.='Building 99 Room 1']"));
        Assert.assertEquals(address1.getText(),"Building 99 Room 1");
    }

    @Test
    public void test2(){
        driver.get("https://afd.calpoly.edu/web/sample-tables");

        String drName = "Dr. Steve";
        List<WebElement> info = driver.findElements(By.xpath("//td[contains(text(),'" + drName + "')]/following-sibling::td"));
        Assert.assertEquals(info.get(0).getText(),"555-5678");
        Assert.assertEquals(info.get(1).getText(),"steve@calpoly.edu");
        Assert.assertEquals(info.get(2).getText(),"56-78");
    }


}
