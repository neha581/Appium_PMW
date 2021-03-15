package appiumtests;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class User_Profile {
	static AppiumDriver<MobileElement> driver;
	private static Logger Log = Logger.getLogger(Login_Logout.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
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
	cap.setCapability("platformVersion","7.0.0");
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
  
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	Thread.sleep(12000);
	verify_number.click();
	System.out.println("verify mobile number.");
	Thread.sleep(12000);
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
	Thread.sleep(1200);
	mobileNumber.sendKeys("7976890438");
	System.out.println("number entered successfully.");

	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	Thread.sleep(12000);
	submitotp.click();
	System.out.println("otp submitted successfully.");
	Thread.sleep(12000);
	
	MobileElement profile = (MobileElement) driver.findElementByAccessibilityId("homenav_3");
	Thread.sleep(12000);
	profile.click();
	System.out.println("go to my profile");
	Thread.sleep(12000);
	
	MobileElement notifi = (MobileElement) driver.findElementByAccessibilityId("profile_4");
	Thread.sleep(12000);
	notifi.click();
	System.out.println("go to notifications");
	Thread.sleep(12000);
	
	MobileElement back = (MobileElement) driver.findElementByAccessibilityId("nav_1");
	Thread.sleep(12000);
	back.click();
	System.out.println("go back.");
	Thread.sleep(12000);
	
	
	MobileElement language = (MobileElement) driver.findElementByAccessibilityId("profile_6");
	Thread.sleep(12000);
	language.click();
	System.out.println("language click");
	Thread.sleep(1200);
	
	MobileElement language1 = (MobileElement) driver.findElementByAccessibilityId("lang_2");
	Thread.sleep(1200);
	language1.click();
	System.out.println("language selected - hindi");
	Thread.sleep(12000);
	
	MobileElement nav = (MobileElement) driver.findElementByAccessibilityId("nav_1");
    Thread.sleep(1200);
    nav.click();
    System.out.println("back to profile page.");
    Thread.sleep(12000);
    MobileElement help = (MobileElement) driver.findElementByAccessibilityId("profile_9");
	Thread.sleep(1200);
	help.click();
	System.out.println("help click");
	Thread.sleep(1200);
    
	MobileElement back2 = (MobileElement) driver.findElementByAccessibilityId("nav_1");
    Thread.sleep(1800);
    back2.click();
    System.out.println("back to profile page.");
    Thread.sleep(12000);
    MobileElement tnc = (MobileElement) driver.findElementByAccessibilityId("profile_11");
	Thread.sleep(1200);
	tnc.click();
	System.out.println("TnC");
	Thread.sleep(1200);
    
    
}
}

