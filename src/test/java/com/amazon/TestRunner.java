package com.amazon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\moham\\eclipse-workspace\\CUCUMBER\\AmazonTest\\src\\test\\resources\\amazon.feature", glue = { "com.amazon" }, plugin = {
		"C:\\Users\\moham\\eclipse-workspace\\CUCUMBER\\AmazonTest\\src\\JSON\\jsonReport.json",
		"html:target" }, dryRun = false, monochrome = true)

public class TestRunner {

}
