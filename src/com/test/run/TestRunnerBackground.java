package com.test.run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features/background"
		,glue={"test.steps.definition.background"}
		,monochrome = true
		)

public class TestRunnerBackground {

}
