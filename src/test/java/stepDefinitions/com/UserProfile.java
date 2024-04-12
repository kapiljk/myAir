package stepDefinitions.com;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.en.*;

public class UserProfile {

	AppiumDriverLocalService service;

	AndroidDriver driver;

	@Then("Click on the User profile Icon in the home screen")
	public void click_on_the_user_profile_icon_in_the_home_screen() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView")).click();
		Thread.sleep(3000);
	      WebElement userProfilePage = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hello\"]"));
	      if (userProfilePage.isDisplayed())
	      {
	      	System.out.println("User Navigated from Home page to User Profile Page");
	      }
	      else 
	      {
	      	System.out.println("User did not Navigate Home page to User Profile page");
	      }

	}

	@Then("Click on the Back arrow in the My profile page and verify the Back flow")
	public void click_on_the_back_arrow_in_the_my_profile_page_and_verify_the_back_flow() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
	
	}

	@Then("Click on the logout button in the My profile page")
	public void click_on_the_logout_button_in_the_my_profile_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Logout\"]")).click();
		Thread.sleep(2000);
	      WebElement logoutPopup = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup"));
	      if (logoutPopup.isDisplayed())
	      {
	      	System.out.println("The Pop up Displayed containing the Yes and I don't want to logout Buttons");
	      }
	      else 
	      {
	      	System.out.println("The popup didn't displayed");
	      }
	}

	@Then("Click on I do not want to logout button in the pop up")
	public void click_on_i_do_not_want_to_logout_button_in_the_pop_up() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"I DO NOT WANT TO LOGOUT\"]")).click();
	
	}

	@Then("Verify the Navigation from logout pop up page to My profile page")
	public void verify_the_navigation_from_logout_pop_up_page_to_my_profile_page() throws InterruptedException {
		Thread.sleep(8000);
        WebElement myProfilePage = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        if (myProfilePage.isDisplayed())
        {
        	System.out.println("User Navigated from logout pop up page to My profile page");
        }
        else {
        	System.out.println("The user did not navigate from the logout popup page to the My Profile page");
        }
	
	}

	@Then("Click on back arrow button in the pop up page")
	public void click_on_back_arrow_button_in_the_pop_up_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
	
	}
	
}
