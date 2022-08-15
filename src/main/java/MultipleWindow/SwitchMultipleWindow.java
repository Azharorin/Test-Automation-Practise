package MultipleWindow;

import com.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class SwitchMultipleWindow extends TestBase {
    public static void main(String[] args) {
        fireFoxlaunch();
        openURL("https://the-internet.herokuapp.com/windows");
        switchWindow();

    }
    public static void switchWindow() {
        //assign parentr guid
        String parentGUID = driver.getWindowHandle();
        String parentTitle = driver.getTitle();
        System.out.println("parent first title" + parentTitle);
        System.out.println(parentGUID);
      WebElement childWindBtn= driver.findElement(By.cssSelector(".example > a:nth-child(2)"));
      childWindBtn.click();
      //get al guid
         Set<String > allGUId=driver.getWindowHandles();
         //switch child
        for(String childsGUID:allGUId){
            driver.switchTo().window(childsGUID);
            driver.navigate().to("https://www.google.com ");
            //driver.navigate().to("");
            String childTitle= driver.getTitle();
            System.out.println(childTitle);
            break;
        }
        for(String childsGUID:allGUId){
            driver.switchTo().window(parentGUID);
            driver.navigate().to("https://www.bbc.com ");
           // driver.navigate().to(url:"");
            String parentSecondTitle= driver.getTitle();

            System.out.println("parent secomd title"+parentSecondTitle);

            System.out.println(parentTitle);
            break;
        }
    }
        //switch to parent


    }

