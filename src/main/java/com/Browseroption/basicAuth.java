package com.Browseroption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class basicAuth {
    public static WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","E:\\Training\\chrome driver version 103\\chromedriver.exe");

        driver= new ChromeDriver();
    }
    @AfterClass
    public void tearDown(){
        //driver.quit();

    }
    @Test
    public void basicAuthentication(){
        // the formula of sending authentication
        //Formula:protocol://username:password@url
        // here http is formula admin username and admin is password then have to give @ and rest of the url
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        String Title= driver.getTitle();
        System.out.println("the title is "+Title);




    }


}
