package TestNGDemo;

import org.testng.annotations.*;

public class TestCase_002 {
    @BeforeClass
    public static void beforeClass_02(){
        System.out.println("i am in beforeclass testcase 02 method ");
    }

    @Test

    public static void test2(){
        System.out.println("i am in under Testt 2method");
    }
    @Test
    public static void test3(){
        System.out.println("i aim in under test 2.1 method");
    }
    @BeforeMethod
    public static void beforeMethod_02(){
        System.out.println("I am in test case_02before method");
    }
    @AfterMethod
    public static void afterMethod_02(){
        System.out.println("i am in after testcase_02 after method");
    }
    @AfterClass
    public static void  afterClass_02(){
        System.out.println(" i am in after class test case_002");
    }

}
