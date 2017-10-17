package mobile.test.automation.scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {
    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.1");
        capabilities.setCapability("deviceName", "Lenovo Z90a40");
       // capabilities.setCapability("app", "/Users/nishant/Development/AppiumDemo/apps/flipkart.apk");
        capabilities.setCapability("appPackage", "jp.hrkzwkbys.lockmemo");
        capabilities.setCapability("appActivity", "jp.hrkzwkbys.lockmemo.MainActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }
}
