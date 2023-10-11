package ne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class elementvisbile {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        // isDisplayed() applicable for all the elements
        boolean b=driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
        System.out.println(b);
        // isEnabled()
        boolean b2=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
        System.out.println(b2);
        //isSelected() applicable for only checkbox,dropdown,radiobutton
        boolean b3=driver.findElement(By.xpath("//button[@name='login']")).isSelected();

    }
}
