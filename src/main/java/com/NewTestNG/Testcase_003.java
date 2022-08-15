package com.NewTestNG;

import org.testng.annotations.*;

public class Testcase_003 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println(" i am in before class 3");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println(" i am in after class 3");
    }
    @BeforeMethod
    public static void beforemethod_TC_003(){
        System.out.println("i am in before method class Tc_003");
    }

    @AfterMethod
    public  static void afterMethod_TC_003(){
        System.out.println(" i am in after method from TC_003 Class");
    }
    @Test
    public static void TC_003(){
        System.out.println(" i am in test class from Test case _003");
    }
}
