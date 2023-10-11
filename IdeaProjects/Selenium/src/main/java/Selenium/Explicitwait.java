package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Explicitwait {
    public static void main(String[] args)  {
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        clickOn(driver, driver.findElement(By.xpath("//button[@name='login']")),10);
    }
    public static void clickOn(WebDriver driver, WebElement locater, int timeout){

        new WebDriverWait(driver,Duration.ofSeconds(timeout)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locater));
        locater.click();
    }
}
