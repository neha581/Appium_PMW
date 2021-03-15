package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
public class AddBankAccount {
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
	mobileNumber.sendKeys("8290660528");
	System.out.println("number entered successfully.");
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	submitotp.click();
	System.out.println("otp submitted successfully.");
	Thread.sleep(18000);
	MobileElement jobcard = (MobileElement) driver.findElementByAccessibilityId("jobcard_8");
	Thread.sleep(12000);
	jobcard.click();
	Thread.sleep(12000);
	System.out.println("Jobcard clicked");
	MobileElement bank = (MobileElement) driver.findElementByAccessibilityId("confirm_bank");
	Thread.sleep(12000);
	bank.click();
	Thread.sleep(12000);
	System.out.println("add clicked");
	MobileElement ifsc = (MobileElement) driver.findElementByAccessibilityId("ifsc_field");
	Thread.sleep(12000);
	ifsc.sendKeys("HDFC0000184");
	Thread.sleep(12000);
	System.out.println("IFSC entered");
	MobileElement account_field = (MobileElement) driver.findElementByAccessibilityId("account_field");
	Thread.sleep(12000);
	account_field.sendKeys("5004765");
	Thread.sleep(12000);
	System.out.println("account number entered");
	MobileElement account2_field = (MobileElement) driver.findElementByAccessibilityId("account2_field");
	Thread.sleep(12000);
	account2_field.sendKeys("5004765");
	Thread.sleep(12000);
	System.out.println("account number confirmed");
	MobileElement nav_2 = (MobileElement) driver.findElementByAccessibilityId("nav_2");
	Thread.sleep(12000);
	nav_2.click();
	Thread.sleep(12000);
	System.out.println("save clicked.");
	
	}

}
