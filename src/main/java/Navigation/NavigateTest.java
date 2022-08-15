package Navigation;

import com.TestBase;

public class NavigateTest extends TestBase {
    public static void main(String[] args) {
        fireFoxlaunch();
        openURL("https://demo.opencart.com/");
        driver.navigate().to("https://google.com");
        navigateBack();
        navigateForward();
        pageRefresh();
closeBrowser();
    }
    public static void navigateBack(){
        driver.navigate().back();
        String Exp_Title="Google";
        String Act_Title= driver.getTitle();
        if(Exp_Title.equals(Act_Title)){
            System.out.println("Test pased");
        }
        else{
            System.out.println("not passed");
        }

    }
    public static void  navigateForward(){
        driver.navigate().forward();
        String Exp_Title="Your Store";
        String Act_Title= driver.getTitle();
        if(Exp_Title.equals(Act_Title)){
            System.out.println("Test pased");
        }
        else{
            System.out.println("not passed");
        }

    }
    public static void pageRefresh(){
        driver.navigate().refresh();


    }

}
