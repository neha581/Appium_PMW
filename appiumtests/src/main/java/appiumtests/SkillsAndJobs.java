package appiumtests;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class SkillsAndJobs {
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
	cap.setCapability("platformVersion","7.0.0");
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
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	Thread.sleep(12000);
	verify_number.click();
	System.out.println("verify mobile number.");
	Thread.sleep(12000);
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
	Thread.sleep(1200);
	mobileNumber.sendKeys("7976890438");
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
	
    MobileElement SnJ = (MobileElement) driver.findElementByAccessibilityId("profile_3");
    Thread.sleep(1200);
    SnJ.click();
    System.out.println("Go to skills and jobs");
    Thread.sleep(12000);
    
    MobileElement status1 = (MobileElement) driver.findElementByAccessibilityId("status_1");
    Thread.sleep(120);
    status1.click();
    MobileElement status2 = (MobileElement) driver.findElementByAccessibilityId("status_2");
    Thread.sleep(120);
    status2.click();
    MobileElement status3 = (MobileElement) driver.findElementByAccessibilityId("status_3");
    Thread.sleep(120);
    status3.click();
    MobileElement status4 = (MobileElement) driver.findElementByAccessibilityId("status_4");
    Thread.sleep(120);
    status4.click();
    System.out.println("status selected");
    Thread.sleep(12000);
    
    MobileElement lang1 = (MobileElement) driver.findElementByAccessibilityId("lang_3");
    Thread.sleep(120);
    lang1.click();
    MobileElement lang2 = (MobileElement) driver.findElementByAccessibilityId("lang_2");
    Thread.sleep(120);
    lang2.click();
    MobileElement lang3 = (MobileElement) driver.findElementByAccessibilityId("lang_1");
    Thread.sleep(120);
    lang3.click();
    System.out.println("app language selected");
    Thread.sleep(12000);
    
    MobileElement domain1 = (MobileElement) driver.findElementByAccessibilityId("domain_1");
    Thread.sleep(120);
    domain1.click();
    MobileElement domain2 = (MobileElement) driver.findElementByAccessibilityId("domain_2");
    Thread.sleep(120);
    domain2.click();
    MobileElement domain3 = (MobileElement) driver.findElementByAccessibilityId("domain_3");
    Thread.sleep(120);
    domain3.click();
    MobileElement domain4 = (MobileElement) driver.findElementByAccessibilityId("domain_4");
    Thread.sleep(120);
    domain4.click();
    MobileElement domain5 = (MobileElement) driver.findElementByAccessibilityId("domain_5");
    Thread.sleep(120);
    domain5.click();
    System.out.println("domain selected");
    Thread.sleep(12000);
    
    MobileElement vehicle1 = (MobileElement) driver.findElementByAccessibilityId("skill_1");
    Thread.sleep(120);
    vehicle1.click();
    MobileElement vehicle2 = (MobileElement) driver.findElementByAccessibilityId("skill_2");
    Thread.sleep(120);
    vehicle2.click();
    MobileElement vehicle3 = (MobileElement) driver.findElementByAccessibilityId("skill_3");
    Thread.sleep(120);
    vehicle3.click();
    System.out.println("vehicle selected");
    Thread.sleep(12000);
    
    MobileElement JP1 = (MobileElement) driver.findElementByAccessibilityId("job_pre_1");
    Thread.sleep(120);
    JP1.click();
    MobileElement JP2 = (MobileElement) driver.findElementByAccessibilityId("job_pre_2");
    Thread.sleep(120);
    JP2.click();
    MobileElement JP3 = (MobileElement) driver.findElementByAccessibilityId("job_pre_3");
    Thread.sleep(120);
    JP3.click();
    System.out.println("Job_prefrence_selected");
    Thread.sleep(12000);
    
    //MobileElement company_name = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]");
    //Thread.sleep(120);
    //company_name.sendKeys("Testcompany");
    //MobileElement job_profile = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]");
    //Thread.sleep(120);
    //job_profile.sendKeys("sales");
    //MobileElement duration = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]");
    //Thread.sleep(120);
    //duration.sendKeys("3");
    //System.out.println("added previous experience");
    //Thread.sleep(12000);
    
    MobileElement Save = (MobileElement) driver.findElementByAccessibilityId("nav_2");
    Thread.sleep(12000);
    Save.click();
    System.out.println("Save info");
    Thread.sleep(12000);
    //MobileElement Back = (MobileElement) driver.findElementByAccessibilityId("nav_1");
    //Thread.sleep(12000);
    //Back.click();
    //System.out.println("go back to profile");
    System.out.println("The End.");
    
    
}
}