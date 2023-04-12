package com.runnerClassLayer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="AllFeatures/Gmail.feature",
		glue="com.stepDefLayer",
		dryRun=false
		
		)
public class RunnerClass {

}
