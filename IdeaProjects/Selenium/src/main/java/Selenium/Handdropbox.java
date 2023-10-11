package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handdropbox {
    public static void main(String[] args){
        System.setProperty("webdriver","C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        Select select=new Select(driver.findElement(By.id("aiusf")));
        select.selectByVisibleText("india");
    }
}
