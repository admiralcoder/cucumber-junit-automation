package tesla;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageStepDefinitions {
	// this is a regular expression / regex that cucumber
	// uses to match a method to a cucumber step

	WebDriver driver;

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() {
		WebDriverManager.chromedriver().setup();
		System.out.println("I am going to www.tesla.com");
		driver = new ChromeDriver();
		driver.get("https://www.tesla.com/");

	}

	@When("^I click on the model S link$")
	public void i_click_on_the_model_S_link() {
		System.out.println("clicking on the model S link");
		driver.findElement(By.linkText("MODEL S")).click();
		;

	}

	@Then("^Model S homepage should be displayed$")
	public void model_S_homepage_should_be_displayed() {
		System.out.println("Verifying the Model S home Page");
		assertTrue(driver.getTitle().contains("Model S"));
		System.out.println(driver.getTitle() + "<------------------");
	}

	@When("^I click on Roadster link$")
	public void i_click_on_Roadster_link() {
		driver.findElement(By.linkText("ROADSTER")).click();

	}

	@Then("^Roadster home page should be displayed$")
	public void roadster_home_page_should_be_displayed() {
		System.out.println(driver.getTitle());
		assertTrue(driver.getTitle().contains("Roadster"));
	}

}
