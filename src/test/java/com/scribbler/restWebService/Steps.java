package com.scribbler.restWebService;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, classes=RestWebServiceApplication.class)
public class Steps {

	private String url;
	private double result;
	private InputData input;
	
	@Given("The REST Api as {string}")
	public void theRESTApiAs(String apiUrl) {
		this.url = apiUrl;
	}

	@When("I invoke the get Api")
	public void iInvokeTheGetApi() {
		RestTemplate rest = new RestTemplate();
		result = rest.getForObject(url, Double.class);
	}
	
	@Then("the output is {double}")
	public void theOutputIs(Double expectedResult) {
		assertEquals(expectedResult, result, 0.001);
	}
	
	@Given("the firstOperand is {double} and secondOperand is {double}")
	public void theFirstOperandIsAndSecondOperandIs(Double firstOperand, Double secondOperand) {
		input.setFirstOperand(firstOperand);
		input.setSecondOperand(secondOperand);
	}

	@When("I invoke the post Api")
	public void iInvokeThePostApi() {
		RestTemplate rest = new RestTemplate();
		result = rest.postForObject(url, input, Double.class);
	}

	@Then("the ouput is {double}")
	public void theOuputIs(Double expectedResult) {
		assertEquals(expectedResult, result, 0.001);
	}

}
