package TestNGDemo;

import org.testng.annotations.*;

public class BasicTestNG {
    @BeforeSuite
     public static void setUpSuite(){
        System.out.println("i am frm before class annonation");

    }
    @AfterSuite
     public static void completeSuite(){
        System.out.println("i am from after class annotation");

    }
    @Test
    public static void TC_01(){
        System.out.println("I am after test class");
    }









}
