package com.newmultipleWindow;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class newmultipleWindow extends TestBase {
    public static void main(String[] args) {
        Chromelaunch();
        openURL("https://the-internet.herokuapp.com/windows");
        switchWindow();
        closeBrowser();
    }
    public static void switchWindow(){
        //assign parent GUID
        String parentGUID= driver.getWindowHandle();
        System.out.println(parentGUID);
        String parentTitle=driver.getTitle();
        System.out.println("parent title is"+parentTitle);
        WebElement childwindowBtn=driver.findElement(By.cssSelector("a[href='/windows/new']"));
       childwindowBtn.click();
       //get all GUID
        Set<String> allGuid =driver.getWindowHandles();
        //switch to child
        for (String childGUID:allGuid){
            driver.switchTo().window(childGUID);
            driver.navigate().to("https://google.com");
            String childTitle= driver.getTitle();
            System.out.println("Child title is "+childTitle);
            break;


        }
        //switch to parent
        for (String childGUID:allGuid){
            driver.switchTo().window(parentGUID);
            driver.navigate().to("https://bbc.com");
            String parentsecond_Title= driver.getTitle();
            System.out.println("second parent title"+parentsecond_Title);
            break;


        }
        //s

    }
}
