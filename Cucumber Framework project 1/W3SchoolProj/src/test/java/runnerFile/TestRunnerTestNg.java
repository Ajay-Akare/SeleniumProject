package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinations",monochrome=true,
plugin="html:target/htmlreport/cucumber.html")
public class TestRunnerTestNg extends AbstractTestNGCucumberTests{

}
