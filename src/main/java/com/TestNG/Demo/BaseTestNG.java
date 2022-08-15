package com.TestNG.Demo;

import org.testng.annotations.*;

public class BaseTestNG {
    @BeforeSuite
    public static void setUpSuite(){
        System.out.println("i am at before suite");

    }
    @AfterSuite
    public static void completeSuite(){
        System.out.println("i am after suite");

    }

    }



