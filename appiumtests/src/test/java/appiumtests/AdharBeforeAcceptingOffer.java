package appiumtests;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AdharBeforeAcceptingOffer {
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
	
	MobileElement jobcard1 = (MobileElement) driver.findElementByAccessibilityId("jobcard_15");
	Thread.sleep(12000);
	jobcard1.click();
	Thread.sleep(12000);
	System.out.println("Jobcard clicked");
	
	MobileElement accept_offer = (MobileElement) driver.findElementByAccessibilityId("select_3");
	Thread.sleep(12000);
	accept_offer.click();
	Thread.sleep(12000);
	System.out.println("accept offer.");
	
	MobileElement adhar = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	Thread.sleep(12000);
	adhar.sendKeys("123456789012");
	Thread.sleep(12000);
	System.out.println("adhar no entered");
	
	MobileElement submit1 = (MobileElement) driver.findElementByAccessibilityId("select_1");
	Thread.sleep(12000);
	submit1.click();
	Thread.sleep(12000);
	System.out.println("adhar no submitted");
	
	//android.view.ViewGroup[@content-desc="select_adhar"]/android.view.ViewGroup
	MobileElement select = (MobileElement) driver.findElementByAccessibilityId("select_adhar");
	Thread.sleep(12000);
	select.click();
	Thread.sleep(12000);
	System.out.println("image upload");
	

    MobileElement select_cam = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	Thread.sleep(12000);
	select_cam.click();
	Thread.sleep(12000);
	System.out.println("take photo clicked");
	
	 MobileElement Adhar_photo_click = (MobileElement)driver.findElementByAccessibilityId("Shutter");
     Thread.sleep(12000);
     Adhar_photo_click.click();
     System.out.println("photo clicked.");
     Thread.sleep(12000);
     
     MobileElement Adhar_photo_OK = (MobileElement)driver.findElementByAccessibilityId("Done");
     Thread.sleep(12000);
     Adhar_photo_OK.click();
     System.out.println("photo OK.");
     Thread.sleep(12000);
	
	MobileElement submit2 = (MobileElement) driver.findElementByAccessibilityId("select_1");
	Thread.sleep(12000);
	submit2.click();
	Thread.sleep(12000);
	System.out.println("adhar uploaded");
	System.out.println("offer accepted.");
		

	}

}
