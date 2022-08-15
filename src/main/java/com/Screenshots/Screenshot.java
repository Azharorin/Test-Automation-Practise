package com.Screenshots;

import com.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

import java.io.IOException;
import java.net.URL;

public class Screenshot extends TestBase  {
    // in main method we have to throw excepotion because we thorw exception in  methods screenshots(), to call it in main method
    public static void main(String[] args) throws IOException {
        Chromelaunch();
        openURL("https://www.google.com/");
        screenShots();
        screenshotSecond("pageimage");
        closeBrowser();
    }
    public static void screenShots() throws IOException {
        //Take screenshots
       File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       ///save image
        FileUtils.copyFile(scrFile,new File(System.getProperty("user.dir")+"//src//main//Screenshot//Google"));

        ////
        File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir")+"//src//main//Screenshot//gogle.png"));




    }

    // sending string not direct name
    public static void screenshotSecond(String name) throws IOException{
        File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir")+"//src/main//Screenshot//"+name+".png"),true
        );

    }

}
