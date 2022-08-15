package WebDriver.Basic;

import com.TestBase;

public class TitleVerification extends TestBase {
    public static void main(String[] args) {
        fireFoxlaunch();
        testCase_003();
        testCase_001();
        testCase_004();
        testCase_002();
        closeBrowser();

    }
    public static void testCase_001(){
        openURL("https://apple.com");
     String Exp_Title="Apple";
     String Act_Title= driver.getTitle();
     if(Exp_Title.equals(Act_Title)){
         System.out.println("tet passef");
     }
     else{
         System.out.println("not passef");
     }

    }
    public static void testCase_002(){
        openURL("https://apple.com");
        String Exp_Title="apple";
        String Act_Title= driver.getTitle();
        if(!Exp_Title.equals(Act_Title)){
            System.out.println("pass");

        }
        else{
            System.out.println("not psss");
        }
    }
    public static void testCase_003 (){
        openURL("https://apple.com");
        String Exp_Title="apple";
        String Act_Title= driver.getTitle();
        if(!Exp_Title.equals(Act_Title)){
            System.out.println("pass");

        }
        else{
            System.out.println("not psss");
        }

    }
    public static void testCase_004 (){
        openURL("https://apple.com");
        String Exp_Title="APPLE";
        String Act_Title= driver.getTitle();
        if(!Exp_Title.equals(Act_Title)){
            System.out.println("pass");

        }
        else{
            System.out.println("not psss");
        }

    }
}

