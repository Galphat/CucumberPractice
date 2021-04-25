package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeature"},
glue = {"stepDefination"},
plugin = {"pretty"},
tags = "@TVSearch or @MobileSearch")
public class AmazonTest  {

}
