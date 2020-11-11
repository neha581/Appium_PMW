package appiumtests;
import java.net.URL;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Invalid_OTP {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
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

URL url = new URL("http://127.0.0.1:4723/wd/hub");
driver = new AppiumDriver<MobileElement>(url, cap);

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
MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_field");
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
System.out.println("otp is wrong.");
Thread.sleep(12000);

MobileElement submitotp1 = (MobileElement) driver.findElementByAccessibilityId("login_8");
Thread.sleep(12000);
submitotp1.click();
System.out.println("otp field is blank.");
Thread.sleep(12000);

MobileElement submitotp2 = (MobileElement) driver.findElementByAccessibilityId("login_8");
Thread.sleep(12000);
submitotp2.click();

System.out.println("use spaces instead of otp.");
Thread.sleep(12000);
}
}

