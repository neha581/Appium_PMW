package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
public class PanBeforeBank {
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
	Thread.sleep(24000);
	MobileElement homenav_1 = (MobileElement) driver.findElementByAccessibilityId("homenav_1");
	homenav_1.click();
	System.out.println("wallet page.");
	Thread.sleep(12000);
	MobileElement wallet_1 = (MobileElement) driver.findElementByAccessibilityId("wallet_1");
	wallet_1.click();
	System.out.println("add bank clicked.");
	Thread.sleep(12000);
	MobileElement ifsc_field = (MobileElement) driver.findElementByAccessibilityId("ifsc_field");
	ifsc_field.sendKeys("HDFC0000184");
	System.out.println("ifsc submitted successfully.");
	Thread.sleep(12000);
	MobileElement account_field = (MobileElement) driver.findElementByAccessibilityId("account_field");
	account_field.sendKeys("500500");
	System.out.println("a/c number submitted successfully.");
	Thread.sleep(12000);
	MobileElement account2_field = (MobileElement) driver.findElementByAccessibilityId("account2_field");
	account2_field.sendKeys("500500");
	System.out.println("a/c number confirmed.");
	Thread.sleep(12000);
	MobileElement nav_2 = (MobileElement) driver.findElementByAccessibilityId("nav_2");
	nav_2.click();
	System.out.println("save");
	Thread.sleep(12000);
	MobileElement pancard = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	pancard.sendKeys("WRTY001HGR");
	System.out.println("pancard");
	Thread.sleep(12000);
	MobileElement select_1 = (MobileElement) driver.findElementByAccessibilityId("select_1");
	select_1.click();
	System.out.println("continue clicked");
	Thread.sleep(12000);
	MobileElement select_adhar = (MobileElement) driver.findElementByAccessibilityId("select_adhar");
	select_adhar.click();
	System.out.println("uplod pan clicked.");
	Thread.sleep(12000);
	MobileElement take_photo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	take_photo.click();
	System.out.println("take photo clicked.");
	Thread.sleep(12000);
	
	MobileElement photos = (MobileElement) driver.findElementByAccessibilityId("Shutter");
	photos.click();
	System.out.println("choose from photos");
	Thread.sleep(12000);
	MobileElement photos1 = (MobileElement) driver.findElementByAccessibilityId("Done");
	photos1.click();
	System.out.println("choose from photo");
	Thread.sleep(12000);
	MobileElement photos2 = (MobileElement) driver.findElementByAccessibilityId("select_1");
	photos2.click();
	System.out.println("continue clicked, save pancard details");
	
	}

}
