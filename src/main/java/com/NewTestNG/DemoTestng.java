package com.NewTestNG;

import com.TestBase;
import org.testng.annotations.*;

public class DemoTestng{
    @BeforeSuite
    public static void setUP(){
        System.out.println(" i am in before suite ");
    }
    @AfterSuite

    public static void aftersetUp(){
        System.out.println("i am in after suite");
    }





}


