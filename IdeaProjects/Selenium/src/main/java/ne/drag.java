package ne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver","C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.switchTo().frame(0);
        Actions action=new Actions(driver);
        Thread.sleep(3000);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
                .release().build().perform();

    }
}
