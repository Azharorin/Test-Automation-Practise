package com.TestNG.Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_001 {
    @BeforeMethod
    public static void beforeTestCase_001(){
        System.out.println("i am before test case method 01");
    }
    @Test
    public static void test1(){
        System.out.println(" iam from test case 01");
    }
    @Test
    public static void test11(){
        System.out.println(" iam from test case 11");
    }
    @AfterMethod
    public static void afterTestCase_001(){
        System.out.println("i am after test case mwethod 01");
    }

}
