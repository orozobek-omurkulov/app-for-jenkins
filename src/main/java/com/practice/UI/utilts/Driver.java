package com.practice.UI.utilts;

import com.practice.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver() {
        // singletone pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                default:
                    driver = ChromeWebDriver.loadChromwDriver();
                    break;
            }
        }

        return driver;
    }


    public static void closeDriver() {
        try {
            if(driver!=null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
