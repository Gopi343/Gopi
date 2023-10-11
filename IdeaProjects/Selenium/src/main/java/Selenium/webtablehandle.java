package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class webtablehandle {
    public static void main(String[] args){
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.get("https://ui.cogmento.com/contacts");
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gopijada55@gmail.com");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gopi.654321");
//        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        //*[@id="countries"]/tbody/tr[2]/td[2]/strong
        //*[@id="countries"]/tbody/tr[3]/td[2]/strong
        //*[@id="countries"]/tbody/tr[4]/td[2]/strong
        //*[@id="countries"]/tbody/tr[5]/td[2]/strong
        //Method one
//        String before_xpath="//*[@id=\"countries\"]/tbody/tr[";
//        String after_xpath="]/td[2]/strong";
//        for(int i=2;i<=5;i++){
//            String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//            System.out.println(name);
//            if(name.equals("Andorra")){
//                driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+i+"]/td[1]/input")).click();
//            }
//        }
        for(int i=2;i<=5;i++){
            String name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();
            System.out.println(name);
            if(name.equals("Andorra")){
                driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]//input[@type='checkbox']")).click();
            }
        }

        //parent precedial xpath method
        ////strong[contains(text(),'Andorra')]/parent::td//preceding-sibling::td//input[@type='checkbox']
       // driver.findElement(By.xpath("//strong[contains(text(),'Andorra')]/parent::td//preceding-sibling::td//input[@type='checkbox']")).click();

    }
}
