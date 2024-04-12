package stepDefinitions.com;

import static org.testng.Assert.assertEquals;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.en.*;

public class GuestFunctionals {
	AppiumDriverLocalService service;

	AndroidDriver driver;
	
	@When("Click on the Guest button in splash screen")
	public void click_on_the_guest_button_in_splash_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"   GUEST\"]")).click();
	}

	@Then("Click on the special assistance button in the home screen")
	public void click_on_the_special_assistance_button_in_the_home_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	}

	@Then("Click on the Back arrow on special assistance page and verify the Functionality of the Back arrow")
	public void click_on_the_back_arrow_on_special_assistance_page_and_verify_the_functionality_of_the_back_arrow() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
	}

	@Then("Verify the Presence of Travelling with childern service along with Icon in the SA landing page")
	public void verify_the_presence_of_travelling_with_childern_service_along_with_icon_in_the_sa_landing_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		boolean displayed = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Travelling with children\"]")).isDisplayed();
		assertEquals(displayed, true);
	}

	@Then("Verify the Presence of Assistance for a person with redued mobility and hidden dsiabilities service along with Icon in the SA landing page")
	public void verify_the_presence_of_assistance_for_a_person_with_redued_mobility_and_hidden_dsiabilities_service_along_with_icon_in_the_sa_landing_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Assistance for a person with reduced mobility and hidden disabilities\"]")).isDisplayed();
		assertEquals(displayed, true);
	}

	@Then("Verify the Presence of Others service along with Icon in the SA landing page")
	public void verify_the_presence_of_others_service_along_with_icon_in_the_sa_landing_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Others\"]")).isDisplayed();
		assertEquals(displayed, true);
	}

	@Then("Verify that user should be navigated to the services details page when clicked on any perticular service")
	public void verify_that_user_should_be_navigated_to_the_services_details_page_when_clicked_on_any_perticular_service() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Travelling with children\"]")).click();
		boolean displayed = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Travelling with children\"]")).isDisplayed();
		assertEquals(displayed, true);
	}

	@Then("Verify that Services should be changed accordingly when terminal name is changed in the drop down in the services details page")
	public void verify_that_services_should_be_changed_accordingly_when_terminal_name_is_changed_in_the_drop_down_in_the_services_details_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"KUL Terminal 2\"]")).click();
		
	}

	@Then("click on menu button in the Home screen")
	public void click_on_menu_button_in_the_home_screen() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[3]/android.view.ViewGroup/android.widget.ImageView[2]")).click();
	}

	@Then("Click on the special assistance button in the menu")
	public void click_on_the_special_assistance_button_in_the_menu() throws InterruptedException {
		Thread.sleep(3000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Unaccompanied Minor Service\"]")).click();
	}

}
