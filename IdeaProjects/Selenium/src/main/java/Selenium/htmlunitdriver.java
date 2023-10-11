package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class htmlunitdriver {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver=new HtmlUnitDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Gopi@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("gaostfss");
        driver.findElement(By.linkText("Create a Page")).click();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
