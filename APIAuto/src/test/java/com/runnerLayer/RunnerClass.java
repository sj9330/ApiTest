package com.runnerLayer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"//AllFeatures"},
		glue= {"src\\test\\java\\com\\stepDefLayer\\EmployeeStepDef.java"},
		dryRun=true
		
		)
public class RunnerClass {


}
