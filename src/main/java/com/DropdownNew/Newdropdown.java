package com.DropdownNew;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Newdropdown extends TestBase{

    public static void main(String[] args) {
        Chromelaunch();
        openURL("https://the-internet.herokuapp.com/dropdown");
        selectIndex();
        selectvalue();
        selectvisibleText();


    }

    public static void selectIndex(){
        WebElement dropdown= driver.findElement(By.id("dropdown"));

        ///need special class select and call object and passing dropdown
        Select obj= new Select(dropdown);
        // if i select option 2 will be selected
        obj.selectByIndex(2);


    }
    public static void selectvalue(){
        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select obj = new Select(dropdown);
        ///passing value 1 dropdown will be selected 1
        obj.selectByValue("1");

    }

    public static void selectvisibleText(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select obj= new Select(dropdown);
        ////passing visible text option
        obj.selectByVisibleText("Option 1");
    }
}
