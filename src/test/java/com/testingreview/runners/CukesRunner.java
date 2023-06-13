package com.veeam.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources",

        glue = "com/veeam/stepdefinations",
        dryRun = false,
        tags = "@regression"
)
public class CukesRunner {
}
