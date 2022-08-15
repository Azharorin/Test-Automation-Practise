package com.properties;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginWithProperties extends TestBase {
    public static void main(String[] args) throws FileNotFoundException,IOException  {
        fireFoxlaunch();
        //Chromelaunch();
        openURL("https://demo.opencart.com/index.php?route=account/login");
        Valid_Tc_login_001();
        //Valid_Tc_login_001();
//        inValid_Tc_login_001();
//        inValid_Tc_login_002();
    }
    public static void Valid_Tc_login_001 () throws FileNotFoundException, IOException {
        //openURL("https://demo.opencart.com/index.php?route=account/login");
       // driver.manage().deleteAllCookies();
        FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//Properties//OR.properties");
        Properties prop = new Properties();
        prop.load(fis);

        WebElement Email=driver.findElement(By.xpath(prop.getProperty("Email_Xpath")));
        WebElement Password=driver.findElement(By.xpath(prop.getProperty("Password_Xpath")));
        WebElement LoginBtn= driver.findElement(By.cssSelector(prop.getProperty("Css_Xpath")));
        //action*/
      //  Email.clear();
       // Email.sendKeys("azhar@gmail.com");
        //Email.sendKeys("ajjjaj.com");
     /*   Password.clear();
        ;
        Password.sendKeys("1234");*/
        //Email.clear();
        Email.sendKeys(prop.getProperty("Email"));
        //Email.sendKeys(prop.getProperty("Email"));

       // Password.clear();
        Password.sendKeys(prop.getProperty("Password"));

        // Password.sendKeys(prop.getProperty("Password"));
        LoginBtn.click();
        ///// read properties file
        /// write Test Report to properties
        FileOutputStream fos= new FileOutputStream (System.getProperty("user.dir")+"//src//main//resources//Properties//Report.properties");

        Properties pr =new Properties();
        pr.setProperty("Email",prop.getProperty("Email"));
        pr.setProperty("Password",prop.getProperty("Password"));
        pr.setProperty("Tester_name","alam");





        String Exp_Title="https://demo.opencart.com/index.php?route=account/login";
        // String Exp_Title="https://es.sportplus.live/tennis/60873/951892/ ";
        //https://es.sportplus.live/tennis/60873/951892/
        String Act_Title= driver.getCurrentUrl();// getting current url
        System.out.println(Act_Title);
        //step 3
        if(Exp_Title.equals(Act_Title)){
            System.out.println("Test pased for 1");
            pr.setProperty("Valid_test", "passd");
        }
        else{
            System.out.println("not passed for 1 invalid");
            pr.setProperty("Valid test", "not passd");
        }
        pr.store(fos,"null");
//        WebElement myAccount= driver.findElement(By.linkText("My Account"));
//
//        WebElement Logout= driver.findElement(By.linkText("Logout"));
//        myAccount.click();
////        //Logout.clear();
//      Logout.click();
       // driver.findElement(By.linkText("Logout")).click();


    }

    public static void inValid_Tc_login_001 (){
//        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
//        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
//        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
////        //action*/
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
        if(!Exp_Title.equals(Act_Title)){
            System.out.println("Test pased for invlaid 2");
        }

        else{
            System.out.println("not passed for invalid 2");
        }




    }
    public static void inValid_Tc_login_002 (){
//        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
//        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
//        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
////        //action*/
//        Email.clear();
//        Email.sendKeys("rogeralam@gmail.com");
//        //Email.sendKeys("ajjjaj.com");
//        Password.clear();
//        Password.sendKeys(" 1234");
//        LoginBtn.click();

        String Exp_Title="Account Logins";
        // String Exp_Title="https://es.sportplus.live/tennis/60873/951892/ ";
        //https://es.sportplus.live/tennis/60873/951892/
       // String Act_Title= driver.getCurrentUrl();// getting current url
        String Act_Title= driver.getTitle();// getting current url

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
