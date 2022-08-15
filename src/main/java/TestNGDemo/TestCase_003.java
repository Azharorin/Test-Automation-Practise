package TestNGDemo;

import org.testng.annotations.*;

import java.util.PriorityQueue;

public class TestCase_003 {
    @BeforeClass
    public static void beforeClass_03(){
        System.out.println("i am in beforeclass testcase 03 ");
    }
    @BeforeMethod
    public static void beforeMethod_03(){
        System.out.println("I am in test case_03 before method");
    }
    @Test(priority = -1, description = "i am from tesmethod3")

    public static void test3(){
        System.out.println("i am in under Test method 3");
    }
    @Test(priority =-2,description = "i am from test 3_1")
    public static void test3_1(){
        System.out.println("i aim in under test 3.1 method");
    }
    @Test(priority = -3, description = "i am from test method 3.11")
    public static void test3_11(){
        System.out.println("i aim in under test 3.11 method");
    }

    @AfterMethod
    public static void afterMethod_03(){
        System.out.println("i am in after testcase_03 after method");
    }
    @AfterClass
    public static void  afterClass_03(){
        System.out.println(" i am in after class test case_003");
    }

}
