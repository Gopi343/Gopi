package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class readpropertiesfile {
    static  WebDriver driver;
    public static void main(String[] arg) throws IOException {
        Properties pro = new Properties();
        FileInputStream ip = new FileInputStream("C:/Users/Gopi.Jada/IdeaProjects/Selenium/src/main/java/Selenium/config.properties");
        pro.load(ip);
        System.out.println(pro.getProperty("name"));

        System.out.println(pro.getProperty("weight"));//not present it will give the null
        String URL=pro.getProperty("url");
        String brow=pro.getProperty("browser");
        if(brow.equals("chrome")) {
            System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(brow.equals("edge")){
            System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/msedgedriver.exe");
            driver = new EdgeDriver();
        }else if(brow.equals("firefox")){
            System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(pro.getProperty("username_xpath"))).sendKeys(pro.getProperty("username"));
        driver.findElement(By.xpath(pro.getProperty("password_xpath"))).sendKeys(pro.getProperty("password"));
    }
}
