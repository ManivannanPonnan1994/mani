package daisy.maveric.com.daisy.maveric.com_01;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, monochrome=true, features= "src/test/java/resources",
				glue="stepdefinition", format= {"pretty" , "html:daisy", "jason:daisy/cucumberReport.json"}, tags= {"@tag4","~@tag2, ~@tag1"}) 
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
