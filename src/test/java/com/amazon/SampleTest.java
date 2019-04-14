package com.amazon;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleTest {
	public static WebDriver driver;
	@Given("The user should in amazon webpage")
	public void the_user_should_in_amazon_webpage() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\CUCUMBER\\FaceBookTest\\lib\\chromedriver.exe");
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	}

	@When("The title should be get")
	public void the_title_should_be_get() {
	String title = driver.getTitle();
	System.out.println(title);
	}

	@Then("The user should close the page")
	public void the_user_should_close_the_page() {
	driver.close();    
	}

}
