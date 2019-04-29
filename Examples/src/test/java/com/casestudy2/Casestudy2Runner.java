package com.casestudy2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="json:src/test/java/com/casestudy2/target/report.json")
public class Casestudy2Runner {

}
