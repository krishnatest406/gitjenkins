package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"C:\\Users\\User\\Desktop\\jenkinsgit\\samplefacebook\\src\\test\\resources\\facebook\\fbook.feature"},				
				glue= {"glucode"},
				monochrome=true,
				plugin= {"pretty","html:target/pass","rerun:target/fail.txt"}
		)
public class FacebookRunnerClass extends AbstractTestNGCucumberTests {

}
