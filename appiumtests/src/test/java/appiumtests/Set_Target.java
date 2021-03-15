package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Set_Target {
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
	Thread.sleep(16000);
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	verify_number.click();
	System.out.println("verify mobile number.");
	Thread.sleep(12000);
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
	mobileNumber.sendKeys("8290660528");
	System.out.println("number entered successfully.");
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	submitotp.click();
	System.out.println("otp submitted successfully.");
	Thread.sleep(12000);
	MobileElement jobcard = (MobileElement) driver.findElementByAccessibilityId("jobcard_45");
	Thread.sleep(12000);
	jobcard.click();
	Thread.sleep(12000);
	System.out.println("Jobcard clicked");
	MobileElement begin_task = (MobileElement) driver.findElementByAccessibilityId("begin_task_1");
	Thread.sleep(12000);
	begin_task.click();
	Thread.sleep(12000);
	System.out.println("begin task clicked");
	MobileElement set_target = (MobileElement) driver.findElementByAccessibilityId("my_target");
	Thread.sleep(12000);
	set_target.click();
	Thread.sleep(12000);
	System.out.println("set target button clicked.");
	}
}

