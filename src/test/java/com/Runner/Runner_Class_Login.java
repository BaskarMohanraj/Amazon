package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/Features" , glue = "com.Step_Definition" , tags = "@AmazonSignup")
					

public class Runner_Class_Login {

}
