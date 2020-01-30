package caseStudies;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Content/CSLogin.feature",
                          glue="caseStudies",
                          //plugin="html:target\\htmlreport")
                          plugin="json:target/jsonreport.json")

public class Runner {

}
