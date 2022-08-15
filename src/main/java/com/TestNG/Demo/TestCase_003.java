package com.TestNG.Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_003 {
    @BeforeClass
    public static void beforeclasslogintestcase_02(){
        System.out.println("i am at before class  test case 03");

    }
    @AfterClass
    public static void afterclassetestlogincase_02(){
        System.out.println("i am at after classm login test case 02");

    }

      @Test(priority =-3,description = "Login_testcas_003")

    public static void Login_TestCase_001(){
        System.out.println(" iam from login test case 01");
    }
    @Test(priority =-2,description = "Login_testcas_003")
    public static void Login_TestCase_002(){
        System.out.println(" iam from login  test case 02");
    }
    @Test(priority =-1,description = "Login_testcas_003")
    public static void Login_TestCase_003(){
        System.out.println(" iam from login  test case 03");
    }

}
