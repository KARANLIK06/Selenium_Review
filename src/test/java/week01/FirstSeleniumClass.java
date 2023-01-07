package week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();


        WebDriver driverChrome=new ChromeDriver();
        WebDriver driverEdge= new EdgeDriver();
        driverChrome.manage().window().maximize();
        driverEdge.manage().window().maximize();

        driverChrome.get("https://www.google.com");
        driverEdge.get("https://practice.cydeo.com");

        driverChrome.close();
        driverEdge.close();
    }
}
