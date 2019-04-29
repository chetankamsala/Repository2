package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,features="Feature",glue= {"stepDefinition"}, tags= {"@sanity"})
//@CucumberOptions(tags= {"@smoke","@sanity"})  AND ed
@CucumberOptions(tags= {"@smoke1","@sanity"})  //AND ed
//@CucumberOptions(tags= {"@smoke,@sanity"})   //OR ed
//@CucumberOptions(tags= {"@smoke or @sanity"})   //OR ed
//@CucumberOptions(tags= {"@smoke","~@sanity"})  //skips sanity scenario
//@CucumberOptions(tags= {"@smoke","not @sanity"})  //skips sanity scenario

public class demo {

}
