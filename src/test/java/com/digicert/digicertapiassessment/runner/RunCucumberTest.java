package com.digicert.digicertapiassessment.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Feature",
        glue = {"com.digicert.digicertapiassessment.runner", "com.digicert.digicertapiassessment.stepdefination"},
        plugin = {"pretty", "html:target/html/cucumber.html", "json:target/Json/cucumber.json", "junit:target/Junit/junit.xml"},
        monochrome = true
)
public class RunCucumberTest {
}
