package TestNGDemo;

import org.testng.annotations.*;

public class TestCase_001 {
    @BeforeClass
    public static void beforeClass_01(){
        System.out.println("i am in beforeclass testcase 01 ");
    }
    @Test

    public static void test1(){
        System.out.println("i am in under Test1 method");
    }
    @Test
    public static void test11(){
        System.out.println("i aim in under test 1.1 method");
    }
    @BeforeMethod
    public static void beforeMethod_01(){
        System.out.println("I am in test case_01 before method");
    }
@AfterMethod
    public static void afterMethod_01(){
        System.out.println("i am in after testcase_01 after method");
}
    @AfterClass
    public static void  afterClass_01(){
        System.out.println(" i am in after class test case_001");
    }

}
