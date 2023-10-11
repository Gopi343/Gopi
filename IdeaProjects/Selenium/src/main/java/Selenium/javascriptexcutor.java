package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class javascriptexcutor {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
       // System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Gopi@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("gaostfss");
        //driver.findElement(By.linkText("Create a Page")).click();
        WebElement element=driver.findElement(By.xpath("//button[@name='login']"));
        //highlight the element
        flash(element,driver);
        //drawbroder
        broder(element,driver);
        File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sc,new File("C:/Users/Gopi.Jada/IdeaProjects/Selenium/src/main/java/Selenium/element.png"));

    }
    public static void flash(WebElement element,WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        String bgcolor= element.getCssValue("backgroundColor");//gives background color
        for(int i=0;i<10;i++){
            changecolor("rgb(0,200,0)",element,driver);
            changecolor(bgcolor,element,driver);
        }

    }
    public static void changecolor(String color,WebElement element,WebDriver driver){
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
                try{
                   Thread.sleep(20);
                }catch (InterruptedException e){

                }
    }
    public static void broder(WebElement element,WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'",element);
    }

}
