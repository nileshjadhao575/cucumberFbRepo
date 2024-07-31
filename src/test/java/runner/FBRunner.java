package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="D:\\WorkSpace2024\\CucumberFB\\src\\main\\java\\FeatureFile\\FbLoginDemo.feature",
		         glue="stepDefination",
		         plugin= {"pretty", "html:target/cucumberReport.html"},
		         monochrome=true,
		         dryRun=false
		         )



		
	


public class FBRunner {

}
