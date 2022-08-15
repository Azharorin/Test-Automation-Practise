package com.Browseroption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Singleframe {
    public static WebDriver driver;

    @BeforeClass
    public void setup(){
        // in headless testing systems.setproperty will come first
        //then create chrome options
        //setting headless true
        System.setProperty("webdriver.chrome.driver","E:\\Training\\chrome driver version 103\\chromedriver.exe");

        //ChromeOptions options= new ChromeOptions();
        //options.setHeadless(true);



        driver= new ChromeDriver();
    }
    @AfterClass
    public void tearDown(){
        //driver.quit();

    }
    @Test(description="headless test 11.08.22")
    public void iFrame(){


        driver.get("https://the-internet.herokuapp.com/iframe");
        String Title= driver.getTitle();
        System.out.println("the title is "+Title);
        // switch to iframe\
        driver.switchTo().frame("mce_0_ifr");
        WebElement iframebody= driver.findElement(By.id("tinymce"));
        iframebody.clear();
        iframebody.sendKeys("Test automation");



    }

}
