package com.softwaretestingboard.magneto.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/resources/featurefile/Women.feature",
        glue ="com/softwaretestingboard/magneto",
        tags ="@smoke",
        plugin={"pretty", "html:target/cucumber-report/cucumber.html"}
)



public class TestRunner {
}
