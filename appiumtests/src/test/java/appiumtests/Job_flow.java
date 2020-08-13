package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Job_flow {
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
	mobileNumber.sendKeys("7976890438");
	System.out.println("number entered successfully.");
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	submitotp.click();
	System.out.println("otp submitted successfully.");
	Thread.sleep(12000);
	MobileElement jobcard = (MobileElement) driver.findElementByAccessibilityId("jobcard_97");
	Thread.sleep(12000);
	jobcard.click();
	Thread.sleep(12000);
	System.out.println("Jobcard clicked");
	MobileElement accept_offer = (MobileElement) driver.findElementByAccessibilityId("select_3");
	Thread.sleep(12000);
	accept_offer.click();
	Thread.sleep(12000);
	System.out.println("accept_offer clicked");
	MobileElement Offer_preview = (MobileElement) driver.findElementByAccessibilityId("select_4");
	Thread.sleep(12000);
	Offer_preview.click();
	Thread.sleep(12000);
	System.out.println("offer preview clicked");
	MobileElement Offer_preview_back = (MobileElement) driver.findElementByAccessibilityId("nav_1");
	Thread.sleep(12000);
	Offer_preview_back.click();
	Thread.sleep(12000);
	System.out.println("offer preview back clicked");
	MobileElement Adhar_details = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	Thread.sleep(12000);
	Adhar_details.sendKeys("124567891245");
	Thread.sleep(12000);
	System.out.println("Adhar_details entered");
	MobileElement Adhar_submit = (MobileElement) driver.findElementByAccessibilityId("select_1");
	Thread.sleep(12000);
	Adhar_submit.click();
	Thread.sleep(12000);
	System.out.println("Adhar_details submit");
	MobileElement Adhar_upload = (MobileElement) driver.findElementByAccessibilityId("select_adhar");
	Thread.sleep(12000);
	Adhar_upload.click();
	Thread.sleep(12000);
	System.out.println("Adhar_upload");
	MobileElement Take_photo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	Thread.sleep(12000);
	Take_photo.click();
	Thread.sleep(12000);
	System.out.println("Adhar_upload_take photo");
	MobileElement Click_photo = (MobileElement) driver.findElementByAccessibilityId("Shutter");
	Thread.sleep(12000);
	Click_photo.click();
	Thread.sleep(12000);
	System.out.println("Adhar_upload_click photo");
	MobileElement Click_Done = (MobileElement) driver.findElementByAccessibilityId("Done");
	Thread.sleep(12000);
	Click_Done.click();
	Thread.sleep(12000);
	System.out.println("Adhar_upload_click photo Done");
	MobileElement Uploaded = (MobileElement) driver.findElementByAccessibilityId("select_1");
	Thread.sleep(12000);
	Uploaded.click();
	Thread.sleep(12000);
	System.out.println("Adhar_uploaded");
	MobileElement Sign = (MobileElement) driver.findElementByAccessibilityId("sign_1");
	Thread.sleep(12000);
	Sign.click();
	Thread.sleep(12000);
	System.out.println("sign");
	MobileElement Proceed = (MobileElement) driver.findElementByAccessibilityId("select_2");
	Thread.sleep(12000);
	Proceed.click();
	Thread.sleep(12000);
	System.out.println("Proceed");	

}
}