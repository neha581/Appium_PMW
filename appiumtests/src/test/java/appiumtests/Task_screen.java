package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Task_screen {
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
	MobileElement jobcard = (MobileElement) driver.findElementByAccessibilityId("jobcard_8");
	Thread.sleep(12000);
	jobcard.click();
	Thread.sleep(12000);
	System.out.println("Jobcard clicked");
	Thread.sleep(1200);
	MobileElement task_description = (MobileElement) driver.findElementByAccessibilityId("task_description_open_1");
	Thread.sleep(12000);
	task_description.click();
	Thread.sleep(12000);
	System.out.println("open link for task");
	
	MobileElement task_link = (MobileElement) driver.findElementByAccessibilityId("close_modal");
	Thread.sleep(12000);
	task_link.click();
	Thread.sleep(12000);
	System.out.println("close link for task");
	
	MobileElement task_instruction = (MobileElement) driver.findElementByAccessibilityId("task_instruction_open_1");
	Thread.sleep(12000);
	task_instruction.click();
	Thread.sleep(12000);
	System.out.println("open task instructions");
	Thread.sleep(90000);
	MobileElement inst_close = (MobileElement) driver.findElementByAccessibilityId("inst_close");
	Thread.sleep(12000);
	inst_close.click();
	Thread.sleep(12000);
	System.out.println("close instruction close.");
	
	MobileElement help = (MobileElement) driver.findElementByAccessibilityId("help_call");
	Thread.sleep(12000);
	help.click();
	Thread.sleep(12000);
	System.out.println("help button clicked and popup shows manager details.");
	
	}
}
