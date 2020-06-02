package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class task {
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
		cap.setCapability("deviceName","AOSP on IA Emulator");
		cap.setCapability("udid","emulator-5554");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9.0.0");
		cap.setCapability("appPackage","com.pickmywork");
		cap.setCapability("appActivity","com.pickmywork.MainActivity");
		cap.setCapability("automationName","UiAutomator2");
		cap.setCapability("clearSystemFiles",true);
		cap.setCapability("autoGrantPermissions",true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		Log.info("New driver instantiated");
		System.out.println("application started");
		Thread.sleep(12000);
		
		MobileElement language = (MobileElement) driver.findElementByAccessibilityId("choose_language");
		System.out.println("element found for language.");
		language.click();
		Thread.sleep(12000);
		MobileElement English = (MobileElement) driver.findElementByAccessibilityId("lang_1");
		English.click();
		System.out.println("Selected English as app language");
		Thread.sleep(12000);
		MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
		verify_number.click();
		
		System.out.println("verify mobile number.");
		Thread.sleep(12000);
		MobileElement mobileNumber = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText");  
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
		MobileElement jobcard = (MobileElement) driver.findElementByAccessibilityId("jobcard_10");
		Thread.sleep(12000);
		jobcard.click();
		Thread.sleep(12000);
		System.out.println("Jobcard clicked");
		MobileElement ID_Card = (MobileElement) driver.findElementByAccessibilityId("");
		Thread.sleep(1200);
		ID_Card.click();
		Thread.sleep(1200);
		System.out.println("open id card page.");
		MobileElement goBackToTask = (MobileElement) driver.findElementByAccessibilityId("");
	    goBackToTask.click();
	    Thread.sleep(1200);
	    System.out.println("back to task page");
	    MobileElement setTarget = (MobileElement) driver.findElementByAccessibilityId("");
	    setTarget.click();
	    Thread.sleep(1200);
	    System.out.println("we are on set weekly target page");
	    //Set Target Page
	    
	    //work order
	    
	    //Training Video
	    
	    
	    
	    MobileElement BeginTask = (MobileElement) driver.findElementsByAccessibilityId("");
	    BeginTask.click();
	    Thread.sleep(1200);
	    System.out.println("we are on task page");
	    
	    MobileElement MerchantMobile = (MobileElement) driver.findElementsByAccessibilityId("");
	    MerchantMobile.sendKeys("7976890438");
	    Thread.sleep(1200);
	    System.out.println("mobile number of merchant");
	    
	    MobileElement MerchantName = (MobileElement) driver.findElementsByAccessibilityId("");
	    MerchantName.sendKeys("Test Merchant");
	    Thread.sleep(1200);
	    System.out.println("name of merchant");
	    
	    MobileElement MerchantPincode = (MobileElement) driver.findElementsByAccessibilityId("");
	    MerchantPincode.sendKeys("324005");
	    Thread.sleep(1200);
	    System.out.println("pincode of merchant");
	    
	    MobileElement SaveDetail = (MobileElement) driver.findElementsByAccessibilityId("");
	    SaveDetail.click();
	    Thread.sleep(1200);
	    System.out.println("merchant details saved.");
	    
	  //Current status tab
	     
	
	}

}
