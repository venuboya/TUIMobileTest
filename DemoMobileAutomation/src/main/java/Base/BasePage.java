package Base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.LoginPage;
import Util.AppConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {
	
	public AppiumDriver appiumDriver;
	public DesiredCapabilities desiredCapabilities;
	public File apkFilePath;
	
	public void initialization() {
	
		apkFilePath = new File(AppConstants.APK_PATH);
		desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", AppConstants.DEVICE_NAME);
		desiredCapabilities.setCapability("platformVersion", AppConstants.DEVICE_VERSION);
		desiredCapabilities.setCapability("platformName", AppConstants.PLATFORM_NAME);
		desiredCapabilities.setCapability("app", apkFilePath.getAbsolutePath());
		desiredCapabilities.setCapability("unicodeKeyboard", true);
		desiredCapabilities.setCapability("resetKeyboard", true);
		try {
			
			appiumDriver = new AndroidDriver<AndroidElement>(new URL(AppConstants.HUB_URL), desiredCapabilities);
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		appiumDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}

}
