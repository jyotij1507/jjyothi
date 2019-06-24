package com.Stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature",glue="com.Stepdefinition",plugin="html:target")

public class TestRunner {
}
