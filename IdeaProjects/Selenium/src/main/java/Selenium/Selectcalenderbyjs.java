package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selectcalenderbyjs {
    public static void main(String[] args){
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        WebElement element3=driver.findElement(By.xpath("//input[@id='sixth_date_picker']"));
        String date2="07/27/2002";
        selebyjs(driver,element3,date2);

    }
    public static void selebyjs(WebDriver driver,WebElement element,String dat){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('value','"+dat+"');",element);
    }
}
