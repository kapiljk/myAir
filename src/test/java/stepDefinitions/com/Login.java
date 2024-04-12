package stepDefinitions.com;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
public class Login {
	AppiumDriverLocalService service;
	AndroidDriver driver;
	
	@Given("open the My airports app from the mobile device")
	public void open_the_my_airports_app_from_the_mobile_device() throws InterruptedException, MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("MyAirportsEmulator");
		options.setApp("C:\\Users\\Mind-Graph\\eclipse-workspace\\MyAirports\\src\\test\\java\\resources\\prod2.apk");
		 Thread.sleep(2000);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(20000);

		System.out.println("inside MobileApp");
	}

	@When("Click on the Login button in splash screen")
	public void click_on_the_login_button_in_splash_screen() throws InterruptedException {
		System.out.println("Click on Login Button");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN / SIGN UP   | \"]")).click();
	}

	@When("Give the login credentials and click on the Submit button")
	public void give_the_login_credentials_and_click_on_the_submit_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email ID\"]")).sendKeys("iotuatproject@gmail.com");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Password\"]")).sendKeys("IOTuat@123");
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
	}

	@When("Access the Location")
	public void access_the_location() throws InterruptedException {
		Thread.sleep(20000);  // Adjust the sleep time as needed
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
	    System.out.println("click on the location access");
	}

	@Then("close the mobile app")
	public void close_the_mobile_app() {
	  // driver.close(); 
	}
}
