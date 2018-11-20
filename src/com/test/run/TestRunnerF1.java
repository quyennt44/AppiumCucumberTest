package com.test.run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features/f1"
		,glue={"test.steps.definition.f1"}
		,monochrome = true
		)

public class TestRunnerF1 {

}
