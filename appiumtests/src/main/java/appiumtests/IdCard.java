package appiumtests;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class IdCard {
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
	Thread.sleep(12000);
	
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
	Thread.sleep(1200);
	mobileNumber.sendKeys("8290660528");
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
	
	MobileElement ID = (MobileElement) driver.findElementByAccessibilityId("idcard_2");
	ID.click();
	System.out.println("ID card clicked.");
	Thread.sleep(1200);
	
	MobileElement JobSelected = (MobileElement) driver.findElementByAccessibilityId("domain_1");
	JobSelected.click();
	System.out.println("job selected for id card.");
	Thread.sleep(1200);
	
	MobileElement back = (MobileElement) driver.findElementByAccessibilityId("id_1");
	back.click();
	System.out.println("go back to home page.");
	Thread.sleep(1200);
		

	}

}

