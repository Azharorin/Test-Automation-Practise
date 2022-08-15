package com.NewTestNG;

import org.testng.annotations.*;

public class TestCase_001 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println(" i am in before class 1 ");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println(" i am in after class 1");
    }
    @BeforeMethod
    public static void beforemethod_TC_001(){
        System.out.println("i am in before method class Tc_001");
    }

    @Test(priority=2, description =" practise test")
    public static void TC_001(){
        System.out.println(" i am in test class TC_001");
    }
    @Test(priority = 1, description = " try to valid test")
    public static void TC_001_Version1(){
        System.out.println(" i am in test class TC_001 Version1`");
    }
    @Test(priority = -1, description ="login valid test")
    public static void Tc_001_Version2(){
        System.out.println(" i am in last but before excuted before tC_001 and version 1 because my priority is higher minimum get higher priprity");

    }

    @AfterMethod
    public  static void afterMethod_TC_001(){
        System.out.println(" i am in after method from TC_001 Class");
    }
}
