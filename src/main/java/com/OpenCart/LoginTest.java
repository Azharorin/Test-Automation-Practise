package com.OpenCart;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends TestBase {
    public static void main(String[] args) {
        fireFoxlaunch();
        openURL("https://demo.opencart.com/index.php?route=account/login");
        Valid_Tc_login_001 ();
        // closeBrowser();

    }

public static void Valid_Tc_login_001 (){
        //openURL("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().deleteAllCookies();

        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
       // action
        Email.clear();
        Email.sendKeys("azhar@gmail.com");
        //Email.sendKeys("ajjjaj.com");
        Password.clear();
        Password.sendKeys("1234");
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
//        WebElement myAccount= driver.findElement(By.linkText("My Account"));
//
//        WebElement Logout= driver.findElement(By.linkText("Logout"));
//        myAccount.click();
////        //Logout.clear();
//      Logout.click();
        driver.findElement(By.linkText("Logout")).click();


}

public static void inValid_Tc_login_001 (){
//        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
//        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
//        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        //action*/
//        Email.clear();
//        Email.sendKeys("rogeralam@gmail.com");
//        //Email.sendKeys("ajjjaj.com");
//        Password.clear();
//        Password.sendKeys(" 1234");
//        LoginBtn.click();

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
        driver.findElement(By.linkText("Logout")).click();

        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
//        WebElement myaccount= driver.findElement(By.linkText("My Account"));
//        WebElement logout= driver.findElement(By.linkText("Logout"));
//
//        myaccount.click();
//        logout.click();

        }

}
