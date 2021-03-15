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
		Thread .sleep(12000);
		MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
		Thread.sleep(12000);
		verify_number.click();
		System.out.println("verify mobile number.");
		Thread.sleep(12000);
		MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
		Thread.sleep(12000);   
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
		
		Thread.sleep(24000);
		
		MobileElement bank_account = (MobileElement) driver.findElementByAccessibilityId("homenav_1");
		Thread.sleep(12000);
		bank_account.click();
		System.out.println("wallet button clicked.");
		Thread.sleep(12000);
		MobileElement addaccount = (MobileElement) driver.findElementByAccessibilityId("wallet_1");
		Thread.sleep(12000);
		addaccount.click();
		System.out.println("add account");
		Thread.sleep(12000);
		
		MobileElement ifsc = (MobileElement)driver.findElementByAccessibilityId("ifsc_field");
		Thread.sleep(12000);   
		ifsc.sendKeys("icic000018");
		System.out.println("ifsc entered successfully.");
		
		MobileElement save = (MobileElement)driver.findElementByAccessibilityId("nav_2");
		Thread.sleep(12000);   
		save.click();
		System.out.println("save button clicked.");
		System.out.println("Error : incorrect ifsc code/ no bank detail found");
		
		MobileElement ifsc1 = (MobileElement)driver.findElementByAccessibilityId("ifsc_field");
		Thread.sleep(12000);   
		ifsc1.sendKeys("icic0000184");
		System.out.println("ifsc entered successfully.");
		
		Thread.sleep(12000);
		
		MobileElement accountno1 = (MobileElement)driver.findElementByAccessibilityId("nav_2");
		Thread.sleep(12000);   
		accountno1.click();
		System.out.println("save button clicked.");
		System.out.println("Error : missing mand paran account no."); 
		
		MobileElement accountno2 = (MobileElement)driver.findElementByAccessibilityId("account_field");
		Thread.sleep(12000);   
		accountno2.sendKeys("123");
		System.out.println("account no entered");
		
		
		MobileElement confirm_accountno = (MobileElement)driver.findElementByAccessibilityId("account2_field");
		Thread.sleep(12000);   
		confirm_accountno.sendKeys("neha");
		System.out.println("verify account no");
		
		MobileElement save_account = (MobileElement)driver.findElementByAccessibilityId("nav_2");
		Thread.sleep(12000);   
		save_account.click();
		System.out.println("account details saved.");
		System.out.println("Error : account no is not same");
		Thread.sleep(1200);
		
		MobileElement accountno4 = (MobileElement)driver.findElementByAccessibilityId("account_field");
		Thread.sleep(12000);   
		accountno4.sendKeys("123ab");
		System.out.println("account no entered");
		
		
		MobileElement confirm_accountno5 = (MobileElement)driver.findElementByAccessibilityId("account2_field");
		Thread.sleep(12000);   
		confirm_accountno5.sendKeys("123ab");
		System.out.println("verify account no");
		// TODO Auto-generated method stub
		
		MobileElement save_account1 = (MobileElement)driver.findElementByAccessibilityId("nav_2");
		Thread.sleep(12000);   
		save_account1.click();
		System.out.println("account details saved.");
		System.out.println("account details saved.");

	}

}
