package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/Feature_File", glue = "stepdefinition", stepNotifications = true, monochrome=true, dryRun = false,
plugin = {"pretty:target/cucumber-pretty.txt","html:target/testreport.html"}, tags = "@swathi")
public class Runnerfileclass {
	

}
