package com.NewNavigation;

import com.TestBase;

public class Navigation extends TestBase {

    public static void main(String[] args) {
        Chromelaunch();
        openURL("https://demo.opencart.com");
        driver.navigate().to("https://google.com");
        navigateBack();
        navigateForward();
        pageRefresh();


    }

    public static void navigateBack(){
        driver.navigate().back();
        String Exp_Title="Your Store";
        String actual_Title= driver.getTitle();
        if(Exp_Title.equals(actual_Title)){
            System.out.println("test is passed");

        }
        else{
            System.out.println("not passed");
        }



    }
    public static void navigateForward(){
        driver.navigate().forward();
        String Exp_Title="google.com";
        String actual_Title= driver.getTitle();
        if(Exp_Title.equals(actual_Title)){
            System.out.println("test is passed");

        }
        else{
            System.out.println("not passed");
        }

    }
    public static void pageRefresh(){
        driver.navigate().refresh();

    }


}
