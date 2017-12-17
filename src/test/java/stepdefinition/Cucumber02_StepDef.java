package stepdefinition;


//changes check for git
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber02_StepDef {
	WebDriver driver = new FirefoxDriver();
	
	@After("@tag4")
	public void embedScreenshot(Scenario scenario) {
		//if (scenario.isFailed())
		//{
			try {
				byte[] screenshot = ((FirefoxDriver) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
			catch(WebDriverException someformsDontSupportScreenshot)
			{
				System.err.println(someformsDontSupportScreenshot);
			}
		//}
	}
	
	
	@Given("^I am a valid user on the web page$")
	public void i_am_a_valid_user_on_the_web_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Entered URL");
	 
	}

	@When("^I enter the username as ([^\"]*)$")
	public void i_enter_the_username_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Captured value : " + arg1);
	}

	@When("^I enter the password as ([^\"]*)$")
	public void i_enter_the_password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click on the SignIn button$")
	public void i_click_on_the_SignIn_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should be navigated to dashboard$")
	public void i_should_be_navigated_to_dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	//scenario 3 - tag3
	@Given("^I am able to access the dashboard$")
	public void i_am_able_to_access_the_dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I enter the insurance records$")
	public void i_enter_the_insurance_records(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> table = arg1.raw();
		System.out.println("printing########## : " + table.get(2).get(4));	
	    
	}

	@When("^I post it$")
	public void i_post_it() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I should be able to retrieve the data fom DB$")
	public void i_should_be_able_to_retrieve_the_data_fom_DB() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}




}
