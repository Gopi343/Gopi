package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
    public static void main(String[] args){
        System.setProperty("webdriver","C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//launch fire fox
        driver.get("https://www.facebook.com");//enters the url
        //xpath
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Gopi.com");
        driver.findElement(By.id("pass")).sendKeys("gfagfodgd2");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.cssSelector("#identify_email")).sendKeys("ifsaiai@mail.com");
        driver.findElement(By.id("did_submit")).click();
        //driver.findElement(By.partialLinkText("Searc")).click();
       // driver.findElement(By.linkText("Cancel")).click();
        //driver.findElement(By.className("_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy")).click();
        driver.quit();


    }
}
