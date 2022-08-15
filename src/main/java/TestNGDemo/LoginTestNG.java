package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestNG
{
    public static WebDriver driver;
    @BeforeClass
    public static void setUp(){

        System.setProperty("webdriver.geckodriver",System.getProperty("user.dir")+"//src//main//resources//geckodriver.exe");

        driver= new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");

    }
    @Test
    public static void Tc_Login_Invalid_001(){
        //openURL("https://demo.opencart.com/index.php?route=account/login");

        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        //action*/
        Email.clear();
        Email.sendKeys("rogeralam@gmail.com");
        Password.clear();
        Password.sendKeys(" 1234");
        LoginBtn.click();



    }
    @Test
    public static void Tc_Login_Valid_002(){
        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement LoginBtn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        //action
        Email.clear();
        Email.sendKeys("email@email.com");
        Password.clear();
        Password.sendKeys(" 12345678");
        LoginBtn.click();
        System.out.println("first test pass");



    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
