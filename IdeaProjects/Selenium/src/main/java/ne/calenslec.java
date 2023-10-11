package ne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class calenslec {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver", "C:/Users/Gopi.Jada/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        String date="1-Jun-2022";
        String arra[]=date.split("-");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='fourth_date_picker']")).click();
        Thread.sleep(1000);
        Select select=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        select.selectByVisibleText(arra[1]);
        Select select1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        select1.selectByVisibleText(arra[2]);
        //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[1]/a
        //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[2]/a
        //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[6]/a
        //*[@id="ui-datepicker-div"]/table/tbody/tr[3]/td[4]/a
        //*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[4]/a
        String Before="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[";
        String After="]/td[";
        boolean x=false;
        String var="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=7;j++){
                try{
                 var=driver.findElement(By.xpath(Before+i+After+j+"]/a")).getText();
                }catch (NoSuchElementException e){
                    System.out.println("Enter correct date");
                    x=false;
                    break;
                }
                if(arra[0].equals(var)){
                    driver.findElement(By.xpath(Before+i+After+j+"]/a")).click();
                    x=true;
                    break;
                }
            }
            if(x){
                break;
            }

        }



    }
}
