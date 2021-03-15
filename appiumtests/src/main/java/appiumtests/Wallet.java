package appiumtests;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Wallet {
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
		// TODO Auto-generated method stub
	driver = new AppiumDriver<MobileElement>(url, cap);
	Log.info("New driver instantiated");
	System.out.println("Application started...");
	Thread .sleep(12000);
	
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	Thread.sleep(1200);
	verify_number.click();
	System.out.println("button:verify mobile number.");
	Thread.sleep(6000);
	
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
	Thread.sleep(1800);   
	mobileNumber.sendKeys("8290660528");
	System.out.println("number entered successfully.");
	Thread.sleep(1200);
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(2800);
	
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	Thread.sleep(12000);
	submitotp.click();
	System.out.println("otp submitted successfully.");
	Thread.sleep(12000);
	
	MobileElement wallet = (MobileElement)driver.findElementByAccessibilityId("homenav_1");
	Thread.sleep(1800);   
	wallet.click();
	System.out.println("wallet button clicked.");
	Thread.sleep(2800);
	MobileElement wallet1 = (MobileElement) driver.findElementByAccessibilityId("transaction");
	wallet1.click();
	System.out.println("show details button clicked.");
	Thread.sleep(20000);
	
	MobileElement invoice = (MobileElement) driver.findElementByAccessibilityId("Invoice");
	Thread.sleep(1200);
	invoice.click();
	System.out.println("invoice clicked");
	Thread.sleep(1200);
	
	MobileElement view_invoice  = (MobileElement) driver.findElementByAccessibilityId("invoice_view");
	Thread.sleep(1200);
	view_invoice.click();
	System.out.println("view_invoice clicked");
	Thread.sleep(12000);
	
	
	MobileElement certificate = (MobileElement) driver.findElementByAccessibilityId("certificate");
	Thread.sleep(1200);
	certificate.click();
	System.out.println("certificate clicked");
	Thread.sleep(1200);
	
	MobileElement certi_view = (MobileElement) driver.findElementByAccessibilityId("certi_view");
	Thread.sleep(1200);
	certi_view.click();
	System.out.println("certificate clicked");
	Thread.sleep(12000);
	
	MobileElement details  = (MobileElement) driver.findElementByAccessibilityId("detail");
	Thread.sleep(1200);
	details.click();
	System.out.println("details clicked");
	Thread.sleep(1200);
	
	MobileElement general_Transactions  = (MobileElement) driver.findElementByAccessibilityId("General Transactions");
	Thread.sleep(1200);
	general_Transactions.click();
	System.out.println("general Transactions clicked");
	Thread.sleep(1200);
	
	MobileElement current_cycle  = (MobileElement) driver.findElementByAccessibilityId("Current Cycle");
	Thread.sleep(1200);
	current_cycle.click();
	System.out.println("current cycle clicked");
	Thread.sleep(1200);
	
	MobileElement PreviousCycle  = (MobileElement) driver.findElementByAccessibilityId("Previous Cycle");
	Thread.sleep(1200);
	PreviousCycle.click();
	System.out.println("PreviousCycle clicked");
	Thread.sleep(1200);
	
	MobileElement older  = (MobileElement) driver.findElementByAccessibilityId("Older");
	Thread.sleep(1200);
	older.click();
	System.out.println("Older clicked");
	Thread.sleep(1200);
	
	MobileElement nav  = (MobileElement) driver.findElementByAccessibilityId("nav_1");
	Thread.sleep(1200);
	nav.click();
	System.out.println("back to wallet page");
	Thread.sleep(1200);
	
	}

}

