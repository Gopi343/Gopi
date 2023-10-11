package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handlebootstrapdropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
//        //we can't use select class for bootstrap dropdowns
//        driver.findElement(By.id("dropdownMenuButton")).click();
//        List<WebElement>li2=driver.findElements(By.xpath("//div[@class='dropdown-menu show' and @aria-labelledby='dropdownMenuButton']//a"));
//
//        for(int i=0;i<li2.size();i++){
//            System.out.println(li2.get(i).getText());
//            if(li2.get(i).getText().equals("Another action")){
//                li2.get(i).click();
//                break;
//            }
//        }
        //for google dropdown
        driver.get("https://accounts.google.com/signup/v2/createaccount?biz=false&cc=IN&continue=https%3A%2F%2Fwww.google.com%3Fhl%3Den-US&dsh=S-234280924%3A1695888272809842&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&theme=glif");
        driver.findElement(By.xpath("//div[@jsname='oYxtQd']")).click();
        List<WebElement>list=driver.findElements(By.xpath("//div[@jsname='xl07Ob']//ul//li//span[@class='VfPpkd-rymPhb-Gtdoyb']//span"));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            if(list.get(i).getText().equals("English (United States)")){
                System.out.println(list.get(i).getText());
                list.get(i).click();

                break;
            }
        }

    }
}
