package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopuphandle {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver","C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //     handling alert

        driver.get("https://www.slazzer.com/upload");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://jeemain.nta.nic.in/jeemain-2023-session-2-result/");

        driver.findElement(By.xpath("//*[@id=\"row-content\"]/div[2]/div/p/a[1]")).click();
        Thread.sleep(4000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

       // for uploading a file
        driver.findElement(By.xpath("//*[@id=\"drag-drop-more-then-one\"]/div[1]/div/div/button[1]")).sendKeys("C:/Users/Gopi.Jada/Pictures/Screenshots/Screenshot (1).png");





    }
}
