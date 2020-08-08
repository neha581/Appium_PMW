package appiumtests;
import java.net.URL;
//import java.util.concurrent.TimeUnit;


//import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;

//import org.testng.Assert;
//import org.testng.annotations.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

//import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginLogout {
	static AppiumDriver<MobileElement> driver;
	
	 //private static Logger Log = Logger.getLogger(Login_Logout.class.getName());
	public static void main(String[] args) {
		//DOMConfigurator.configure("log4j.xml");
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
	@BeforeMethod
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
	//cap.setCapability("adbExecTimeout",30000);
    //cap.setCapability("app","C:\\Users\\Reculta\\AppData\\Local\\Android\\Sdk\\platform-tools\\app-release.apk");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AppiumDriver<MobileElement>(url, cap);
	//Log.info("New driver instantiated");
	System.out.println("Application started...");
	Thread .sleep(12000);
	}
	@Test
	public void TC() throws InterruptedException{
	
	MobileElement choose_lang  = (MobileElement) driver.findElementByAccessibilityId("choose_language");
	Thread .sleep(12000);
	choose_lang.click();
	System.out.println("choose_lang");
	Thread .sleep(1200);
	MobileElement language = (MobileElement) driver.findElementByAccessibilityId("lang_1");
	Thread .sleep(1200);
	language.click();
	System.out.println("select english as app language.");
	Thread .sleep(1200);
	
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	Thread.sleep(12000);
	verify_number.click();
	System.out.println("button:verify mobile number.");
	Thread.sleep(12000);
	
	MobileElement mobileNumber = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText");
	Thread.sleep(12000);   
	mobileNumber.sendKeys("8290660528");
	System.out.println("number entered successfully.");
	Thread.sleep(1200);
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
	MobileElement logout = (MobileElement) driver.findElementByAccessibilityId("profile_5");
	Thread.sleep(12000);
	logout.click();
	System.out.println("logout");
	}

	
}

