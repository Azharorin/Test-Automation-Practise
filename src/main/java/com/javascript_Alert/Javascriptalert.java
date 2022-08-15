package com.javascript_Alert;

import com.Screenshots.Screenshot;
import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Javascriptalert extends TestBase {
    public static void main(String[] args)  {
        Chromelaunch();
        openURL("https://the-internet.herokuapp.com/javascript_alerts");
        normaljsALert();
       // Screenshot.screenshotSecond("javascript alert");
        confirmjsAlert();
        promptjsALert();


    }
    public static void normaljsALert() {
        WebElement normalalertBtn= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        normalalertBtn.click();
        //for closing alert ok
        driver.switchTo().alert().accept();
        //getting alert text title
        String alertTitle= driver.switchTo().alert().getText();
        System.out.println(" getting the alert title in alert box"+alertTitle);




    }
//button[@onclick='jsConfirm()']
    public static void confirmjsAlert(){
        WebElement confirmAlert= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirmAlert.click();
        // for closing alert ok
        driver.switchTo().alert().accept();
        //click cancel
        driver.switchTo().alert().dismiss();
        //getting title
        String alertTitle= driver.switchTo().alert().getText();
        System.out.println("getting confirm alert text "+alertTitle);



    }
    public static void promptjsALert(){
        WebElement promptjsBtn= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptjsBtn.click();
        // writting on alert textbox
        driver.switchTo().alert().sendKeys("Text whatever ");
        //for ok
        driver.switchTo().alert().accept();


    }






}
