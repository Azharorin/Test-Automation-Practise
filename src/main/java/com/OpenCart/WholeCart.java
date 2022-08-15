package com.OpenCart;

import com.TestBase;

public class WholeCart extends TestBase {
    public static void main(String[] args) {
        //fireFoxlaunch();
        // chromeDriverlaunch();
        Chromelaunch();
        openURL("https://demo.opencart.com/index.php?route=account/register");
        Registration.validRegistration();

        openURL("https://demo.opencart.com/index.php?route=account/login");
        LoginTest.Valid_Tc_login_001();

      // Logout.logout();

    }
}
