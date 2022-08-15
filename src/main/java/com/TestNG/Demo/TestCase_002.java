package com.TestNG.Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_002 {
    @BeforeClass
    public static void beforeclasstestcase_02(){
        System.out.println("i am at before class  test case 02");

    }
    @AfterClass
    public static void afterclassetestcase_02(){
        System.out.println("i am at after class test case c 02");

    }
    @Test
    public static void test2(){
        System.out.println(" iam from test case 02");
    }
    @Test
    public static void test21(){
        System.out.println(" iam from test case 021 ");
    }
}
