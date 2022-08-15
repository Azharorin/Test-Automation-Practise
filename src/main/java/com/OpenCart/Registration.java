package com.OpenCart;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Registration  extends TestBase {
    public static void main(String[] args) {
       // fireFoxlaunch();
        Chromelaunch();

        openURL("https://demo.opencart.com/index.php?route=account/register");
        validRegistration();
        //name();
        System.out.println(name());

    }
    protected static String name(){
        String SALTCHAR="rogeralam";
        StringBuilder salt=new StringBuilder();
        Random rnd=new Random();
        while(salt.length()<10){
            int index=(int)(rnd.nextFloat()*SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));

        }
        String sa= salt.toString();

        return sa;
    }
    public static void validRegistration(){
        WebElement firstname= driver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement lastname= driver.findElement((By.xpath("//input[@id='input-lastname']")));
        WebElement email= driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
        WebElement password= driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement confirmpassword= driver.findElement(By.xpath("//input[@id='input-confirm']"));
        WebElement newsletter= driver.findElement(By.xpath("//input[@id='input-confirm']"));
        WebElement privacycheckbox= driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        WebElement continuebuton=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        firstname.clear();
        firstname.sendKeys("roger");
        lastname.clear();
        lastname.sendKeys("alam");
        telephone.clear();
        telephone.sendKeys("01919991");
        email.clear();
        email.sendKeys(name()+"@gmail.com");
        password.clear();
        password.sendKeys("1234");
         confirmpassword.clear();
        confirmpassword.sendKeys("1234");
        //newsletter.clear();

        //newsletter.click();

        privacycheckbox.click();

        continuebuton.click();


    }



}
