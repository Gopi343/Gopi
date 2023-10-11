package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class frames {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver","C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //giving 30 seconds for slelenium to wait to pefrom an action on element;(Dynamic wait)
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //giving 20 seconds for selenium to wait for  load the page
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

       driver.findElement(By.id("name")).sendKeys("hi");
       driver.switchTo().frame(driver.findElement(By.id("frm1")));
        Select select=new Select(driver.findElement(By.id("course")));
        select.selectByVisibleText("Java");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();//to original webpage
        driver.findElement(By.id("name")).sendKeys("Gopi");
        //for nested frames to get back to parent frame
        //driver.switchTo().parentFrame();
    }
}
