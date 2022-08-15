package com;

import com.itextpdf.text.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBase {
    public static WebDriver driver;

    public static void main(String[] args) throws FileNotFoundException, IOException, DocumentException {
        fireFoxlaunch();
        //chromeDriverlaunch();
        Chromelaunch();

    }
    public static void fireFoxlaunch(){
        //System.setProperty("webdriver.geckodriver","E:\\Training\\PeopleNTech\\Bitm Online 6\\Testonline\\geckodriver.exe");
        //dynamic path
        System.setProperty("webdriver.geckodriver",System.getProperty("user.dir")+"//src//main//resources//geckodriver.exe");

        driver= new FirefoxDriver();
        //open url
        //openURL("https://google.com");

    }
/*    public static void chromeDriverlaunch(){
        //  System.setProperty("webdriver.chromedriver","E:\\Training\\PeopleNTech\\Bitm Online 6\\Testonline\\chromedriver.exe");
        //dynamic path
        System.setProperty("webdriver.chromedriver",System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
        driver= new ChromeDriver();

       // driver.manage().window().maximize();
        //openURL("https://apple.com");
        //maximize
        closeBrowser();

    }*/
    public static void Chromelaunch(){
        System.setProperty("webdriver.chrome.driver","E:\\Training\\chrome driver version 103\\chromedriver.exe");
       // System.setProperty("webdriver.chromedriver",System.getProperty("userdir")+"//src//main//resources//chromedriver.exe");

        driver= new ChromeDriver();


        /*//driver.get("https://apple.com");
        driver.manage().window().maximize();
        geturl("https://www.apple.com/");
        // driver.get("apple.com");
        closebrowser();
*/


    }
    public static void openURL(String Url){
        driver.get(Url);
    }
    public static void closeBrowser(){
        driver.close();
    }
}
