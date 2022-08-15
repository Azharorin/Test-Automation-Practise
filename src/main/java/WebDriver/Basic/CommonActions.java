package WebDriver.Basic;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.xml.bind.Element;

public class CommonActions extends TestBase{
    public  static WebElement element;
    public static void main(String[] args) {
        fireFoxlaunch();
        openURL("https://demo.opencart.com/index.php?route=account/login");
        Valid_Tc_login_001 ();
       // closeBrowser();
    }
/*    public static void type(String  elementXpath, String Value){
driver.findElement(By.xpath(elementXpath)).sendKeys(Value);
    }
    public static void click(String elementXpath){
        driver.findElement(By.xpath(elementXpath)).click();




        }*/
    public static void Valid_Tc_login_001 (){
        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        //action*/
        Email.clear();
        Email.sendKeys("azhar@gmail.com");
        //Email.sendKeys("ajjjaj.com");
        Password.clear();
        Password.sendKeys(" 1234");
        LoginBtn.click();

      //  String Exp_Title="https://demo.opencart.com/index.php?route=account/login";
        String Exp_Title="https://es.sportplus.live/tennis/60873/951892/ ";
        //https://es.sportplus.live/tennis/60873/951892/
        String Act_Title= driver.getCurrentUrl();// getting current url
        System.out.println(Act_Title);
        //step 3
        if(Exp_Title.equals(Act_Title)){
            System.out.println("Test pased");
        }
        else{
            System.out.println("not passed");
        }

    }
    public static void inValid_Tc_login_001 (){
        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        //action*/
        Email.clear();
        Email.sendKeys("azhar@gmail.com");
        //Email.sendKeys("ajjjaj.com");
        Password.clear();
        Password.sendKeys(" 1234");
        LoginBtn.click();

        String Exp_Title="https://demo.opencart.com/index.php?route=account/login";
       // String Exp_Title="https://es.sportplus.live/tennis/60873/951892/ ";
        //https://es.sportplus.live/tennis/60873/951892/
        String Act_Title= driver.getCurrentUrl();// getting current url
        System.out.println(Act_Title);
        //step 3
        if(Exp_Title.equals(Act_Title)){
            System.out.println("Test pased");
        }
        else{
            System.out.println("not passed");
        }

    }



}
