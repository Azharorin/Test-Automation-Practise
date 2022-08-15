package com.NewTestNG;

import org.testng.annotations.*;

public class TestCase_002 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println(" i am in before class 2");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println(" i am in after class 2");
    }
    @BeforeMethod
    public static void beforemethod_TC_002(){
        System.out.println("i am in before method class Tc_002");
    }

    @Test
    public static void TC_002(){
        System.out.println(" i am in test class from test case class TC-002");
    }
    @AfterMethod
    public  static void afterMethod_TC_002(){
        System.out.println(" i am in after method from TC_002 Class");
    }
}
