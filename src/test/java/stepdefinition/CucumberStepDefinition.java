package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
public class CucumberStepDefinition {
	
	WebDriver driver = new FirefoxDriver();
	@Given("^I am a registered on the web page$")
	public void i_am_a_registered_on_the_web_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://magento.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("MY ACCOUNT")).click();
	}

	@When("^I update my user credentials$")
	public void i_update_my_user_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("natarajan.ramanathan93@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
	}

	//@ignore
	@When("^I click on Login$")
	public void i_click_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("send2")).click();
	}
	
	@Then("^I should get access to the Dashboard$")
	public void i_should_get_access_to_the_Dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(true, driver.findElement(By.linkText("Log Out")).isDisplayed());
	}
	
	@Given("^Im not a registered user on the web page$")
	public void im_not_a_registered_user_on_the_web_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://magento.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		System.out.println("successfull Executed");
	}

	@Then("^I should get an error message$")
	public void i_shoould_get_an_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("successfull Executed 03");
	    
	}

}
