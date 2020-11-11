package appiumtests;
import java.net.URL;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
public class Job_Apply {
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
	Thread.sleep(12000);
	
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	verify_number.click();
	System.out.println("verify mobile number.");
	Thread.sleep(4000);
	
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
	Thread.sleep(1200);
	mobileNumber.sendKeys("7976890438");
	System.out.println("number entered successfully.");
	
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	submitotp.click();
	Thread.sleep(2000);
	System.out.println("otp submitted successfully.");
	Thread.sleep(20000);
	MobileElement jobcard = (MobileElement) driver.findElementByAccessibilityId("jobcard_50");
	Thread.sleep(2000);
	jobcard.click();
	Thread.sleep(2000);
	System.out.println("Jobcard clicked");
	
	MobileElement apply = (MobileElement) driver.findElementByAccessibilityId("apply_4");
	Thread.sleep(2000);
	apply.click();
	Thread.sleep(2000);
	System.out.println("applied.");
	
	MobileElement slotbook = (MobileElement) driver.findElementByAccessibilityId("book_1");
	Thread.sleep(2000);
	slotbook.click();
	Thread.sleep(2000);
	System.out.println("slot selected");
	MobileElement slotbooked = (MobileElement) driver.findElementByAccessibilityId("book_2");
	Thread.sleep(12000);
	slotbooked.click();
	System.out.println("slot booked");
	
	// After selection//
	
	MobileElement home = (MobileElement) driver.findElementByAccessibilityId("nav_1");
	Thread.sleep(12000);
	home.click();
	System.out.println("home");
	
	MobileElement jobcard1 = (MobileElement) driver.findElementByAccessibilityId("jobcard_50");
	Thread.sleep(12000);
	jobcard1.click();
	Thread.sleep(12000);
	System.out.println("Jobcard clicked");
	
	MobileElement preview = (MobileElement) driver.findElementByAccessibilityId("select_4");
	Thread.sleep(12000);
	preview.click();
	Thread.sleep(12000);
	System.out.println("work order preview.");
	
	MobileElement accept_offer = (MobileElement) driver.findElementByAccessibilityId("select_3");
	Thread.sleep(12000);
	accept_offer.click();
	Thread.sleep(12000);
	System.out.println("accept offer.");
	
	MobileElement sign = (MobileElement) driver.findElementByAccessibilityId("sign_2");
	Thread.sleep(12000);
	sign.click();
	Thread.sleep(12000);
	System.out.println("sign work order.");
	
	MobileElement preview1 = (MobileElement) driver.findElementByAccessibilityId("select_4");
	Thread.sleep(12000);
	preview1.click();
	Thread.sleep(12000);
	System.out.println("work order preview after sign.");
	
	MobileElement proceed = (MobileElement) driver.findElementByAccessibilityId("select_2");
	Thread.sleep(12000);
	proceed.click();
	Thread.sleep(12000);
	System.out.println("proceed to task.");
	
	}
	}
