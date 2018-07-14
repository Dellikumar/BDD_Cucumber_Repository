package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
   features="D:\\Eclipse\\BDDFreeCRMProject\\src\\main\\java\\features\\taggedHooks.feature"
		   ,glue={"stepDefinations"}
           ,format={"pretty","html:test-output"},
        		   dryRun=false,monochrome=true,strict=true,tags={"~@RegressionTest","~@SmokeTest","~@End2End","~@FunctionalTest"}
	)

public class HookTestRunner {
	
	

}
