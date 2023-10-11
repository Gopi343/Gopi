package ne;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class main {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver","C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scores/53350/eng-vs-aus-1st-test-the-ashes-2023");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Actions action =new Actions(driver);
        //to move the cursor or mouseover to a particular menu
        action.moveToElement(driver.findElement(By.linkText("Teams"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("India")).click();
    }
}
