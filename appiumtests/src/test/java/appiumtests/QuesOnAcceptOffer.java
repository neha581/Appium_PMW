package appiumtests;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
public class QuesOnAcceptOffer {
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
	Thread.sleep(12000);
	
	MobileElement verify_number = (MobileElement) driver.findElementByAccessibilityId("intro_3");
	verify_number.click();
	System.out.println("verify mobile number.");
	Thread.sleep(4000);
	
	MobileElement mobileNumber = (MobileElement)driver.findElementByAccessibilityId("mobile_id");
	Thread.sleep(1200);
	mobileNumber.sendKeys("7976890438");
	System.out.println("number entered successfully.");
	
	MobileElement submit = (MobileElement) driver.findElementByAccessibilityId("login_1");
	submit.click();
	System.out.println("number submitted successfully.");
	Thread.sleep(12000);
	MobileElement submitotp = (MobileElement) driver.findElementByAccessibilityId("login_8");
	submitotp.click();
	Thread.sleep(2000);
	System.out.println("otp submitted successfully.");
	Thread.sleep(20000);
	MobileElement jobcard = (MobileElement) driver.findElementByAccessibilityId("jobcard_15");
	Thread.sleep(2000);
	jobcard.click();
	Thread.sleep(2000);
	System.out.println("Jobcard clicked");
	Thread.sleep(8000);
	
	MobileElement accept_offer = (MobileElement) driver.findElementByAccessibilityId("select_3");
	accept_offer.click();
	System.out.println("accept offer clicked");
	Thread.sleep(2000);
	
	MobileElement submit1 = (MobileElement) driver.findElementByAccessibilityId("submit_quest");
	submit1.click();
	System.out.println("submit without answering mandatory questions.");
	Thread.sleep(2000);
	
	MobileElement ans1 = (MobileElement) driver.findElementByAccessibilityId("text_0");
	ans1.sendKeys("ans");
	System.out.println("answer mandatory questions at accept offer.");
	Thread.sleep(4000);
	
	MobileElement submit2 = (MobileElement) driver.findElementByAccessibilityId("submit_quest");
	submit2.click();
	System.out.println("submit ans for mandatory questions.");
	Thread.sleep(8000);
	
	MobileElement sign = (MobileElement) driver.findElementByAccessibilityId("sign_2");
	sign.click();
	System.out.println("signed work order.");
	Thread.sleep(5000);

	MobileElement proceed = (MobileElement) driver.findElementByAccessibilityId("select_2");
	proceed.click();
	System.out.println("proceed to training.");
	Thread.sleep(8000);
	
	MobileElement quesbeforetraining = (MobileElement) driver.findElementByAccessibilityId("text_0");
	quesbeforetraining.sendKeys("ans");
	System.out.println("ans mandatory question before starting training.");
	Thread.sleep(5000);
	
	MobileElement submit3 = (MobileElement) driver.findElementByAccessibilityId("submit_quest");
	submit3.click();
	System.out.println("submit ans for mandatory questions.");
	Thread.sleep(50000);
	
	MobileElement start_task = (MobileElement) driver.findElementByAccessibilityId("train_comp");
	start_task.click();
	System.out.println("start task button clicked.");
	Thread.sleep(5000);
	
	MobileElement ques = (MobileElement) driver.findElementByAccessibilityId("text_0");
	ques.sendKeys("ans");
	System.out.println("ans mandatory ques after training.");
	Thread.sleep(5000);
	
	MobileElement submit4 = (MobileElement) driver.findElementByAccessibilityId("submit_quest");
	submit4.click();
	System.out.println("submit ans for mandatory questions.");
	Thread.sleep(12000);
	
	MobileElement ques1 = (MobileElement) driver.findElementByAccessibilityId("text_0");
	ques1.sendKeys("ans");
	System.out.println("ans mandatory ques before start task.");
	Thread.sleep(5000);
	
	MobileElement task = (MobileElement) driver.findElementByAccessibilityId("submit_quest");
	task.click();
	System.out.println("submit ans for mandatory questions.");
	Thread.sleep(5000);
	}

}
