package appiumtests;


import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



//import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
public class PmwTest {
	static AppiumDriver<MobileElement> driver;
	//private static Object by;

public static void main(String[] args) {
		try {
			openPickmywork();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
		System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
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

driver = new AppiumDriver<MobileElement>(url, cap);
System.out.println("Application started...");

Thread .sleep(12000);

MobileElement language = (MobileElement) driver.findElementByAccessibilityId("intro_1");
Thread .sleep(12000);
System.out.println("element found for language.");
language.click();

MobileElement hindi = (MobileElement) driver.findElementByAccessibilityId("intro_2");
Thread .sleep(12000);
hindi.click();
System.out.println("language selected.");

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
mobileNumber.sendKeys("7976890438");
System.out.println("number entered successfully.");

MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
submit.click();
System.out.println("number submitted successfully.");
Thread.sleep(12000);
//MobileElement otp = (MobileElement) driver.findElementByAccessibilityId("otp");
//Thread.sleep(12000);
//otp.sendKeys("1234");
//System.out.println("otp entered successfully.");

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

MobileElement back = (MobileElement) driver.findElementByAccessibilityId("nav_1");
Thread.sleep(12000);
back.click();
System.out.println("back button");
Thread.sleep(12000);
MobileElement skills_and_jobs = (MobileElement) driver.findElementByAccessibilityId("profile_3");
Thread.sleep(12000);
skills_and_jobs.click();
System.out.println("skills_and_jobs");

MobileElement back_1 = (MobileElement) driver.findElementByAccessibilityId("nav_1");
Thread.sleep(12000);
back_1.click();
System.out.println("back button");
Thread.sleep(1200);
MobileElement notification = (MobileElement) driver.findElementByAccessibilityId("profile_4");
Thread.sleep(12000);
notification.click();
System.out.println("notification");

MobileElement back_2 = (MobileElement) driver.findElementByAccessibilityId("nav_1");
Thread.sleep(12000);
back_2.click();
System.out.println("back button");
Thread.sleep(12000);
MobileElement change_language = (MobileElement) driver.findElementByAccessibilityId("profile_6");
Thread.sleep(12000);
change_language.click();
System.out.println("language change");

MobileElement back_3 = (MobileElement) driver.findElementByAccessibilityId("nav_1");
Thread.sleep(12000);
back_3.click();
System.out.println("back button");
Thread.sleep(12000);
MobileElement logout = (MobileElement) driver.findElementByAccessibilityId("profile_5");
Thread.sleep(12000);
logout.click();
System.out.println("logout");
}

}
