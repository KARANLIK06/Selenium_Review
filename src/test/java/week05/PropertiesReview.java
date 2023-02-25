package week05;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class PropertiesReview {
    @Test
    public void test1(){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.compiler"));


        System.out.println(ConfigurationReader.getProperty("username"));
    }
}
