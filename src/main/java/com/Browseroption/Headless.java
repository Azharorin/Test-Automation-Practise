package com.Browseroption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Headless {

    public static WebDriver driver;

    @BeforeClass
    public void setup(){
        // in headless testing systems.setproperty will come first
        //then create chrome options
        //setting headless true
        System.setProperty("webdriver.chrome.driver","E:\\Training\\chrome driver version 103\\chromedriver.exe");

        ChromeOptions options= new ChromeOptions();
        options.setHeadless(true);



        driver= new ChromeDriver(options);
    }
    @AfterClass
    public void tearDown(){
        //driver.quit();

    }
    @Test(description="headless test 11.08.22")
    public void headLess(){

            // the formula of sending authentication
            //Formula:protocol://username:password@url
            // here http is formula admin username and admin is password then have to give @ and rest of the url
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
            String Title= driver.getTitle();
            System.out.println("the title is "+Title);



        }

}
