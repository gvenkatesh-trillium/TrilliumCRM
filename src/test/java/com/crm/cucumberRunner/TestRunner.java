package com.crm.cucumberRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json",
        "junit:target/cucumber-results.xml"},
        features = {"./src/test/java/featuresFiles"},
        glue = {"com.crm.stepDefinations", "com.crm.abstractPages"})
class TestRunner {


}