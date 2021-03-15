package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class ReferralCode {
	static AppiumDriver<MobileElement> driver;
	 private static Logger Log = Logger.getLogger(Login_Logout.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
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
	Thread.sleep(16000);
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	verify_number.click();
	System.out.println("verify mobile number.");
	Thread.sleep(12000);
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");  
	mobileNumber.sendKeys("7976890438");
	System.out.println("number entered successfully.");
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	submitotp.click();
	System.out.println("otp submitted successfully.");
	Thread.sleep(18000);
	MobileElement submit1 = (MobileElement) driver.findElementByAccessibilityId("login_2");
	submit1.click();
	System.out.println("submit without entering name and referral code.");
	Thread.sleep(12000);
	
	MobileElement checkbox = (MobileElement) driver.findElementByAccessibilityId("login_7");
	checkbox.click();
	System.out.println("check box for referral code clicked.");
	Thread.sleep(120);
	MobileElement submit2 = (MobileElement) driver.findElementByAccessibilityId("login_2");
	submit2.click();
	System.out.println("submit.");
	Thread.sleep(120);
	MobileElement name = (MobileElement) driver.findElementByAccessibilityId("user_name");
	name.sendKeys("Test");
	System.out.println("name entered");
	Thread.sleep(120);
	MobileElement code = (MobileElement) driver.findElementByAccessibilityId("referral_code");
	code.sendKeys("Test");
	System.out.println("invalid referral code.");
	Thread.sleep(120);
	
	MobileElement submit4 = (MobileElement) driver.findElementByAccessibilityId("login_2");
	submit4.click();
	System.out.println("submit.");
	Thread.sleep(12000);
	
	MobileElement code1 = (MobileElement) driver.findElementByAccessibilityId("referral_code");
	code1.sendKeys("Test");
	System.out.println("invalid referral code.");
	Thread.sleep(1200);
	
	MobileElement submit5 = (MobileElement) driver.findElementByAccessibilityId("login_2");
	submit5.click();
	System.out.println("submit.");
	Thread.sleep(12000);
	
	MobileElement code2 = (MobileElement) driver.findElementByAccessibilityId("referral_code");
	code2.sendKeys("Test");
	System.out.println("spaces in referral code field.");
	Thread.sleep(1200);
	
	MobileElement submit6 = (MobileElement) driver.findElementByAccessibilityId("login_2");
	submit6.click();
	System.out.println("submit.");
	Thread.sleep(12000);
	
	MobileElement code3 = (MobileElement) driver.findElementByAccessibilityId("referral_code");
	code3.sendKeys("vP0IhqCdC7");
	System.out.println("enter valid referral code.");
	Thread.sleep(1200);
	
	MobileElement submit3 = (MobileElement) driver.findElementByAccessibilityId("login_2");
	submit3.click();
	System.out.println("submit.");
	Thread.sleep(12000);
	}

}
