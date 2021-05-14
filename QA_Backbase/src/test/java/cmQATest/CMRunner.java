package cmQATest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
plugin= {"pretty","html:target/cucumber/cucumber.html"},
features="src/test/resources/features",
glue= {"cmSteps"},
tags="@CM",
dryRun=false,
monochrome=true)

public class CMRunner {

	public static void main(String[] args) {
		
	}

}
