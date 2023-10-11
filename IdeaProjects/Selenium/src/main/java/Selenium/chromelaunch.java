package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class chromelaunch {
    public static void main(String[] args){
        System.setProperty("webdriver","C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//launch chrome

        driver.get("http://www.facebook.com");//enters the url

        if(driver.getTitle().equals("Facebook – log in or sign up")){
            System.out.println("Matched");
        }else{
            System.out.println("Mismatched");
        }
        System.out.println(driver.getCurrentUrl());
        driver.quit();
        //System.out.println(driver.getPageSource());
//        System.setProperty("webdriver1","C:/Users/Gopi.Jada/Downloads/geckodriver.exe");
 //       Select select=new Select(driver.findElement(By.id("aiusf")));
 //       select.selectByVisibleText("india");
//        WebDriver driver1=new FirefoxDriver();
//        driver1.get("http://www.youtube.com");
//        System.out.println(driver1.getTitle());


    }
}
