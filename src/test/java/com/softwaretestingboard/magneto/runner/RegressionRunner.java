package com.softwaretestingboard.magneto.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/resources/featurefile/Gear.feature",
        glue ="com/softwaretestingboard/magneto",
        tags ="@regression",
        plugin={"pretty", "html:target/cucumber-report/cucumber.html"}
)




public class RegressionRunner {
}
