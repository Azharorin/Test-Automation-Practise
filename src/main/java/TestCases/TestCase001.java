package TestCases;

import com.TestBase;

public class TestCase001 extends TestBase {
    public static void main(String[] args) {
        fireFoxlaunch();
        openURL("https://cnn.com");
        closeBrowser();
    }
}
