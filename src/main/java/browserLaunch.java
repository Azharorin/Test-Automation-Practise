import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserLaunch {
    public static  WebDriver driver;
    public static void main(String[] args) {
       // fireFoxlaunch();
       // chromeDriverlaunch();

    /* //WebDriver driver; // webdriver interface driver reference variable
        *//*System.setProperty("webdriver.geckodriver","E:\\Training\\PeopleNTech\\Bitm Online 6\\Testonline\\geckodriver.exe");

        driver= new FirefoxDriver();*//*
       System.setProperty("webdriver.chromedriver","E:\\Training\\PeopleNTech\\Bitm Online 6\\Testonline\\chromedriver.exe");
        driver= new ChromeDriver();*/



    }
    /*public static void fireFoxlaunch(){
        //System.setProperty("webdriver.geckodriver","E:\\Training\\PeopleNTech\\Bitm Online 6\\Testonline\\geckodriver.exe");
        //dynamic path
        System.setProperty("webdriver.geckodriver",System.getProperty("user.dir")+"//src//main//resources//geckodriver.exe");

        driver= new FirefoxDriver();
        //open url
       openURL("https://google.com");

    }
    public static void chromeDriverlaunch(){
      //  System.setProperty("webdriver.chromedriver","E:\\Training\\PeopleNTech\\Bitm Online 6\\Testonline\\chromedriver.exe");
        //dynamic path
        System.setProperty("webdriver.chromedriver",System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        openURL("https://apple.com");
        //maximize
        closeBrowser();

    }
    public static void openURL(String Url){
        driver.get(Url);
    }
    public static void closeBrowser(){
        driver.close();
    }*/


}
