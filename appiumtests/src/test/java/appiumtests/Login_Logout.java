package appiumtests;
import java.net.URL;
//import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.Assert;
//import org.testng.annotations.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login_Logout {
	static AppiumDriver<MobileElement> driver;
	 private static Logger Log = Logger.getLogger(Login_Logout.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		try {
			openPickmywork();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
}
	@Test
	
	public static void openPickmywork() throws Exception
	{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("newCommandTimeout", 100000);
	cap.setCapability("avdLaunchTimeout",90000);
	cap.setCapability("avdReadyTimeout",60000);
	cap.setCapability("deviceName","Android SDK build for x86");
	cap.setCapability("udid","emulator-5554");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","9.0.0");
	cap.setCapability("appPackage","com.pickmywork");
	cap.setCapability("appActivity","com.pickmywork.MainActivity");
	cap.setCapability("automationName","UiAutomator2");
	cap.setCapability("clearSystemFiles",true);
	cap.setCapability("autoGrantPermissions",true);
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AppiumDriver<MobileElement>(url, cap);
	Log.info("New driver instantiated");
	System.out.println("Application started...");
	Thread .sleep(12000);
	
	
	MobileElement choose_lang  = (MobileElement) driver.findElementByAccessibilityId("choose_language");
	Thread .sleep(1200);
	choose_lang.click();
	System.out.println("choose_lang");
	Thread .sleep(1200);
	MobileElement language = (MobileElement) driver.findElementByAccessibilityId("lang_3");
	Thread .sleep(1200);
	language.click();
	System.out.println("Telugu");
	Thread .sleep(1200);
	MobileElement choose_lang1  = (MobileElement) driver.findElementByAccessibilityId("choose_language");
	Thread .sleep(1200);
	choose_lang1.click();
	System.out.println("choose_lang");
	Thread .sleep(1200);
	MobileElement hindi = (MobileElement) driver.findElementByAccessibilityId("lang_2");
	Thread .sleep(1200);
	hindi.click();
	System.out.println("language selected.");
	Thread .sleep(1200);
	MobileElement choose_lang2  = (MobileElement) driver.findElementByAccessibilityId("choose_language");
	Thread .sleep(1200);
	choose_lang2.click();
	System.out.println("choose_lang");
	Thread .sleep(1200);
	
	MobileElement English = (MobileElement) driver.findElementByAccessibilityId("lang_1");
	Thread .sleep(1200);
	English.click();
	System.out.println("select english as app language.");
	Thread .sleep(1200);
	
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	Thread.sleep(1200);
	verify_number.click();
	System.out.println("button:verify mobile number.");
	Thread.sleep(1200);
	
	MobileElement mobileNumber = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText");
	Thread.sleep(1200);   
	mobileNumber.sendKeys("8290660528");
	System.out.println("number entered successfully.");
	Thread.sleep(1200);
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	Thread.sleep(1200);
	submitotp.click();
	System.out.println("otp submitted successfully.");
	Thread.sleep(12000);

	MobileElement profile = (MobileElement) driver.findElementByAccessibilityId("homenav_3");
	Thread.sleep(12000);
	profile.click();
	System.out.println("go to my profile");
	Thread.sleep(12000);
	MobileElement logout = (MobileElement) driver.findElementByAccessibilityId("profile_5");
	Thread.sleep(1200);
	logout.click();
	System.out.println("logout");
	}
	
	 
}
