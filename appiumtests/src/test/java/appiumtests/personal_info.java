package appiumtests;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
public class personal_info {
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

		Thread .sleep(12000);
		
		
		MobileElement English = (MobileElement) driver.findElementByAccessibilityId("intro_1");
		Thread .sleep(12000);
		System.out.println("select english as app language.");
		English.click();

		MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
		Thread.sleep(12000);
		verify_number.click();
		System.out.println("verify mobile number.");
		Thread.sleep(12000);
		MobileElement mobileNumber = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText");
		Thread.sleep(12000);   
		mobileNumber.sendKeys("8290660528");
		System.out.println("number entered successfully.");

		MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
		submit.click();
		System.out.println("number submitted successfully.");
		Thread.sleep(12000);
		
		MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
		Thread.sleep(12000);
		submitotp.click();
		System.out.println("otp submitted successfully.");
		Thread.sleep(12000);
		MobileElement profile = (MobileElement) driver.findElementByAccessibilityId("homenav_3");
		Thread.sleep(12000);
		profile.click();
		System.out.println("go to my profile");
		Thread.sleep(12000);
		MobileElement personal_info = (MobileElement) driver.findElementByAccessibilityId("profile_2");
		Thread.sleep(12000);
		personal_info.click();
		System.out.println("go to personal info");
		Thread.sleep(12000); 
		MobileElement fullName = (MobileElement)driver.findElementByAccessibilityId("name");
		Thread.sleep(12000);   
		fullName.sendKeys("PMW Test");
		System.out.println("name entered successfully.");
		Thread.sleep(12000); 
		MobileElement email = (MobileElement)driver.findElementByAccessibilityId("email");
		Thread.sleep(12000);   
		email.sendKeys("support@pickmywork.com");
		System.out.println("email entered successfully.");
		Thread.sleep(12000); 
		MobileElement DOB = (MobileElement)driver.findElementByAccessibilityId("ppi_1");
		Thread.sleep(12000);   
		DOB.click();
		System.out.println("select DOB");
		Thread.sleep(12000); 
		MobileElement Year = (MobileElement)driver.findElementById("android:id/date_picker_header_year");
		Thread.sleep(12000);   
		Year.click();
		System.out.println("select year");
		Thread.sleep(12000); 
		MobileElement select_year = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[1]");
		// TODO Auto-generated method stub
        Thread.sleep(12000);
        select_year.click();
        System.out.println("selected the year of birth");
        Thread.sleep(12000); 
        MobileElement year_selected = (MobileElement) driver.findElementById("android:id/button1");
        Thread.sleep(12000);
        year_selected.click();
        System.out.println("YearOk");
        Thread.sleep(12000); 
        MobileElement Gender = (MobileElement) driver.findElementByAccessibilityId("ppio_2");
        Thread.sleep(12000);
        Gender.click();
        System.out.println("Gender selected");
        Thread.sleep(12000); 
        MobileElement address = (MobileElement)driver.findElementByAccessibilityId("address");
		// TODO Auto-generated method stub
        Thread.sleep(12000);
        address.sendKeys("test address");
        System.out.println("address enetered successfully");
        Thread.sleep(1200);
        
        MobileElement Save = (MobileElement) driver.findElementByAccessibilityId("nav_2");
        Thread.sleep(12000);
        Save.click();
        System.out.println("Save info");
        System.out.println("The End.");
	}
		

}
