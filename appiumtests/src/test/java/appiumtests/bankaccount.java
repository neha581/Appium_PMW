package appiumtests;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class bankaccount {
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
		static AppiumDriver<MobileElement> driver;
		private static Logger Log = Logger.getLogger(Login_Logout.class.getName());
		
		
		
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

		//Thread .sleep(12000);
		//MobileElement language = (MobileElement) driver.findElementByAccessibilityId("intro_1");
		//Thread .sleep(12000);
		//System.out.println("element found for language.");
		//language.click();
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
		
		MobileElement bank_account = (MobileElement) driver.findElementByAccessibilityId("homenav_1");
		Thread.sleep(12000);
		bank_account.click();
		System.out.println("bank_account");
		Thread.sleep(12000);
		MobileElement addaccount = (MobileElement) driver.findElementByAccessibilityId("wallet_1");
		Thread.sleep(12000);
		addaccount.click();
		System.out.println("add account");
		Thread.sleep(12000);
		
		MobileElement ifsc = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText");
		Thread.sleep(12000);   
		ifsc.sendKeys("icic0000184");
		System.out.println("ifsc entered successfully.");
		
		Thread.sleep(12000);
		
		MobileElement accountno = (MobileElement)driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]");
		Thread.sleep(12000);   
		accountno.sendKeys("123");
		System.out.println("ifsc entered successfully.");
		
		MobileElement confirm_accountno = (MobileElement)driver.findElementByXPath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
		Thread.sleep(12000);   
		confirm_accountno.sendKeys("123");
		System.out.println("account no confirmed");
		
		MobileElement accountHolderName = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[5]");
		Thread.sleep(12000);   
		accountHolderName.sendKeys("neha");
		System.out.println("account holder name.");
		
		MobileElement save_account = (MobileElement)driver.findElementByAccessibilityId("nav_2");
		Thread.sleep(12000);   
		save_account.click();
		System.out.println("account details saved.");
		Thread.sleep(1200);
		// TODO Auto-generated method stub

	}

}
