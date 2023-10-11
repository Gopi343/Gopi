package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Headlesschrometesting {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");

        //for headless chromebrowser
        ChromeOptions options=new ChromeOptions();
        options.addArguments("window-size=1400-800");//we should give the window size if not gives element not found exception
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Forgotten password?")).click();
        System.out.println(driver.getTitle());



    }
}
