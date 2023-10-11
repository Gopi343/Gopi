package ne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class handlewindowpop {
    public static void main(String[] args) throws Exception {
        //handling window handler api
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rrc.texas.gov/resource-center/research/gis-viewer/gis-popup-blocker-test/#");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//a[@class='btn goBtn']")).click();
        Set<String> handler=driver.getWindowHandles();
        Iterator<String>it=handler.iterator();
        String parentId=it.next();
        System.out.println("parent id : "+parentId);
        String childId=it.next();
        System.out.println("child window id :"+childId);
        driver.switchTo().window(childId);
        Thread.sleep(2000);
        System.out.println("child window title : "+driver.getTitle());
        //to colse the present window(present control window)
        driver.close();
        //window id can
        driver.switchTo().window(parentId);
        Thread.sleep(2000);
        System.out.println("parent window title : "+driver.getTitle());

    }
}
