package com.test.run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features/android"
		,glue={"test.steps.definition.android"}
		,monochrome = true
		)

public class TestRunnerAndroid {

}
