package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //to find no of links in a webpage.
        List<WebElement> l = driver.findElements(By.tagName("a"));
        System.out.println(l.size());
        //how to get text of each link
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i).getText());
        }
        driver.quit();
    }
}
