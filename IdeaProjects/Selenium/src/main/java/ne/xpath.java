package ne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.half.ebay.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // xpath
        driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Shirt");
        driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("Short");
       //when the id is dynamic id
//        driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("Short");
//        driver.findElement(By.xpath("//input[ends-with(@id,'gh-ac')]")).sendKeys("Short");
        //for the linktext:custom xpath(<a> htmltag for linktext
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }
}
