package appiumtests;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
   public class ImageUpload {
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
		
		MobileElement Pannumber = (MobileElement)driver.findElementByAccessibilityId("pan_number");
        Thread.sleep(120);
        Pannumber.sendKeys("testpan123");
        System.out.println("pan entered successfully");
        Thread.sleep(12000);
        
        MobileElement Panupload = (MobileElement)driver.findElementByAccessibilityId("ppi_3");
        Thread.sleep(120);
        Panupload.click();
        System.out.println("pan upload clicked");
        Thread.sleep(1200);
        
        MobileElement Pan_takephoto = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        Thread.sleep(120);
        Pan_takephoto.click();
        System.out.println("takephoto clicked.");
        Thread.sleep(1200);
        
        MobileElement photo_click = (MobileElement)driver.findElementByAccessibilityId("Shutter");
        Thread.sleep(1200);
        photo_click.click();
        System.out.println("photo clicked.");
        Thread.sleep(12000);
        
        MobileElement photo_OK = (MobileElement)driver.findElementByAccessibilityId("Done");
        Thread.sleep(1200);
        photo_OK.click();
        System.out.println("photo OK.");
        Thread.sleep(12000);
        
        MobileElement Aadhaar = (MobileElement)driver.findElementByAccessibilityId("aadhar_number");
        Thread.sleep(12000);
        Aadhaar.sendKeys("123456789012");
        System.out.println("Aadhaar entered successfully");
        Thread.sleep(12000);
        
        MobileElement adhar_upload = (MobileElement)driver.findElementByAccessibilityId("ppi_4");
        Thread.sleep(12000);
        adhar_upload.click();
        System.out.println("adhar upload clicked");
        Thread.sleep(12000);
        
        MobileElement adhar_takephoto = (MobileElement)driver.findElementById("android:id/text1");
        Thread.sleep(12000);
        adhar_takephoto.click();
        System.out.println("takephoto clicked.");
        Thread.sleep(1200);
        
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
        
        MobileElement Save = (MobileElement) driver.findElementByAccessibilityId("nav_2");
        Thread.sleep(12000);
        Save.click();
        System.out.println("Save info");
        System.out.println("The End.");
		
		}
   }