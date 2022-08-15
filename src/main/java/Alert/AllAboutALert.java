package Alert;

import com.Screenshots.Screenshot;
import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AllAboutALert extends TestBase {
    public static void main(String[] args)  throws IOException {
        fireFoxlaunch();
        openURL("https://the-internet.herokuapp.com/javascript_alerts");
        normalJsAlert();
        confirmaJsAlert();
        jsPromptALert();


    }
    public static void normalJsAlert() throws IOException {
        WebElement normalAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        normalAlertBtn.click();
        //alert Title
        String AlerTitle= driver.switchTo().alert().getText();

        System.out.println("nomral alert"+AlerTitle);
        //click ok

        driver.switchTo().alert().accept();
        Screenshot.screenshotSecond(" calling it from screen shot class in allabou");
}
    public static void confirmaJsAlert(){
        WebElement confirmlAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        confirmlAlertBtn.click();
        //alert Title
        String AlerTitle= driver.switchTo().alert().getText();

        System.out.println("confirmalert"+AlerTitle);
        //click ok

       // driver.switchTo().alert().accept();
        //click cancel
        driver.switchTo().alert().dismiss();
    }
    public static void jsPromptALert(){
        WebElement confirmlAlertBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        confirmlAlertBtn.click();
        //alert Title
        String AlerTitle= driver.switchTo().alert().getText();

        System.out.println("promptlert"+AlerTitle);
        //Write
        driver.switchTo().alert().sendKeys("Test automation");
//        //click ok

           driver.switchTo().alert().accept();
//        //click cancel
//        driver.switchTo().alert().dismiss();


    }


}
