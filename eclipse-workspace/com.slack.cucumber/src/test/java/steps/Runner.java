package steps;
//configuration class of cucumber
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "steps", plugin = { "pretty",
"json:target/report/json/output.json", "html:target/report/html" }
//, dryRun = true, strict = true
, tags={"@signInPage"}
)   
public class Runner {

} 
