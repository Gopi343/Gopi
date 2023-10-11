package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bootstrapdropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
        List<WebElement> li=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
        System.out.println(li.size());
        for(int i=0;i<li.size();i++){
            String name=li.get(i).getText();
            System.out.println(name);
            if(name.equals("Angular")){
                li.get(i).click();
                break;
            }

        }
//        for(int i=0;i<li.size();i++){
//            boolean b=li.get(i).isSelected();
//            System.out.println(b);
//            if(!b){
//                li.get(i).click();
//                System.out.println(li.get(i).getText());
//            }
//        }
    }
}
