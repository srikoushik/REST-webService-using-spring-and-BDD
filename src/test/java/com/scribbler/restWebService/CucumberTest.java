package com.scribbler.restWebService;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/scribbler/restWebService/", snippets = SnippetType.CAMELCASE, plugin = {"pretty"})
public class CucumberTest {
	
}
