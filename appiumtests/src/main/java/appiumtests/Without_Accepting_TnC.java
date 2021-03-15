package appiumtests;
import java.net.URL;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Without_Accepting_TnC {
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openPickmywork();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public static void openPickmywork() throws Exception
	{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("newCommandTimeout", 100000);
	cap.setCapability("avdLaunchTimeout",90000);
	cap.setCapability("avdReadyTimeout",60000);
	cap.setCapability("deviceName","Android SDK build for x86");
	cap.setCapability("udid","emulator-5554");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","7.0.0");
	cap.setCapability("appPackage","com.pickmywork");
	cap.setCapability("appActivity","com.pickmywork.MainActivity");
	cap.setCapability("automationName","UiAutomator2");
	cap.setCapability("clearSystemFiles",true);
	cap.setCapability("autoGrantPermissions",true);

	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver<MobileElement>(url, cap);
	
	System.out.println("Application started...");
	Thread .sleep(12000);
	}
	@Test
	public void TC() throws InterruptedException{
		
		MobileElement choose_lang  = (MobileElement) driver.findElementByAccessibilityId("choose_language");
		Thread .sleep(12000);
		choose_lang.click();
		System.out.println("choose_lang");
		Thread .sleep(1200);
		MobileElement language = (MobileElement) driver.findElementByAccessibilityId("lang_1");
		Thread .sleep(1200);
		language.click();
		System.out.println("select english as app language.");
		Thread .sleep(1200);
		
		MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
		Thread.sleep(12000);
		verify_number.click();
		System.out.println("button:verify mobile number.");
		Thread.sleep(12000);
		MobileElement TnC = (MobileElement) driver.findElementByAccessibilityId(("login_4"));
		TnC.click();
		System.out.println("accept privacy policy.");
		Thread.sleep(1200);
		MobileElement submit = (MobileElement) driver.findElementByAccessibilityId(("login_9"));
		submit.click();
		System.out.println("submit button");
		System.out.println("accept privacy policy to login.");
	}
}

