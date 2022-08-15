package com.OpenCart;

import TestCases.TestCase001;
import WebDriver.Basic.TitleVerification;
import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends TestBase {
    public static void main(String[] args) {
        fireFoxlaunch();
       // chromeDriverlaunch();
       // Chromelaunch();

        openURL("https://demo.opencart.com/index.php?route=account/register");
        Registration2.validRegistration();
        //Registration.validRegistration();
        //LoginTest.Valid_Tc_login_001();

        openURL("https://demo.opencart.com/index.php?route=account/login");
       LoginTest.Valid_Tc_login_001();
        //driver.findElement(By.linkText("Logout")).click();



        // Logsout();

    }
    public static void Logsout(){
//        openURL("https://demo.opencart.com/index.php?route=account/login");
////        LoginTest.Valid_Tc_login_001();
//        WebElement myacc= driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
//       WebElement myaccount= driver.findElement(By.linkText("My Account"));
//        WebElement logout= driver.findElement(By.linkText("Logout"));
//        myacc.click();
//        myaccount.click();
//        logout.click();
//        System.out.println("test pass for log out");


//       myacc.click();
//        //myaccount.clear();
  ///     myAccount.click();
//        //Logout.clear();
//        Logout.click();
       /* driver.findElement(By.linkText("Logout")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
//        driver.findElement(By.linkText("Register")).click()*/
        driver.findElement(By.linkText("Logout")).click();


    }
}
