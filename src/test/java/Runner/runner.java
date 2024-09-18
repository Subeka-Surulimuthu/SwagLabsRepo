package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features="src/test/java/FeatureFiles",
	glue="StepDefenitions",
	monochrome=true,
	tags="@endtoend",
	plugin= {"pretty", "html:target/cucumber.html",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					
	
	}
	
	
)

public class runner extends AbstractTestNGCucumberTests{

}
