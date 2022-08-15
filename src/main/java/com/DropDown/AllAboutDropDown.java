package com.DropDown;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AllAboutDropDown extends TestBase {
    public static void main(String[] args) {
        fireFoxlaunch();
        openURL("https://the-internet.herokuapp.com/dropdown");
        selectByIndex();
        selectByValue();
        selectByVisibleText();

    }
    public static void selectByIndex(){
        WebElement dropDown= driver.findElement(By.id("dropdown"));
        Select obj= new Select(dropDown );
        obj.selectByIndex(2);
        // option 2 select korbe

    }
    public static void selectByValue(){
        WebElement dropDown= driver.findElement(By.id("dropdown"));
        Select obj= new Select(dropDown );
        obj.selectByValue("1");// option 1 er value select korbe

    }
    public static void selectByVisibleText(){
        WebElement dropDown= driver.findElement(By.id("dropdown"));
        Select obj= new Select(dropDown );
        obj.selectByVisibleText("Option 2");// option 1 er value select korbe

    }


}
