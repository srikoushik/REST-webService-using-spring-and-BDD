Feature: Build a simple calculator application using the REST web service.
		Scenario: Invoking addition web service using GET.
			Given The REST Api as "http://localhost:8090/api/v1/add?firstOperand=10&secondOperand=20"
			When I invoke the get Api
			Then the output is 30.0
			
		Scenario: Invoking addition web service using POST.
			Given The REST Api as "http://localhost:8090/api/v2/add"
			And the firstOperand is "10" and secondOperand is "30"
			When I invoke the post Api
			Then the ouput is 40.0