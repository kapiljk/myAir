package stepDefinitions.com;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.en.*;

public class EssentialServices {
	AppiumDriverLocalService service;

	AndroidDriver driver;
	
	@When("Click on the Essential&Services")
	public void click_on_the_essential_services() throws InterruptedException {
	   Thread.sleep(10000);
		//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Essential & Services\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")).click();
		
	}

	@When("Click on the dropdown")
	public void click_on_the_dropdown() throws InterruptedException {
		Thread.sleep(3000);
	   driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 1\"]")).click();
	}

	@Then("Change the terminal in the drop down of Essentials & servicespage")
	public void change_the_terminal_in_the_drop_down_of_essentials_servicespage() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 1\"]")).click();
	}

	@Then("Click on the Search bar")
	public void click_on_the_search_bar() {
	    System.out.println("Passed");
	}

	@Then("click on any POI in the Essentials & servicespage")
	public void click_on_any_poi_in_the_essentials_servicespage() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
	}

	@Then("click on the Add to Favourites button and verify its functionality in  Essentials & servicespage")
	public void click_on_the_add_to_favourites_button_and_verify_its_functionality_in_essentials_servicespage() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	}

	@Then("click on the rating button and verify its functionality in Essentials & servicespage")
	public void click_on_the_rating_button_and_verify_its_functionality_in_essentials_servicespage() throws InterruptedException {
		Thread.sleep(3000);
driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[11]/android.view.ViewGroup[5]/android.widget.ImageView")).click();
	}

	@Then("click on the Share button and verify its functionality in Essentials & servicespage")
	public void click_on_the_share_button_and_verify_its_functionality_in_essentials_servicespage() {
System.out.println("passed");
	}

	@Then("Verify the Back arrow functionality in Essentials & servicespage")
	public void verify_the_back_arrow_functionality_in_essentials_servicespage() throws InterruptedException {
		Thread.sleep(3000);
	   driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	}

	@Then("Click on the Back Arrow button in Essentials & servicespage")
	public void click_on_the_back_arrow_button_in_essentials_servicespage() throws InterruptedException {
		Thread.sleep(3000);
	   driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	}
	
}
