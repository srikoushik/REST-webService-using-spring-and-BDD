package com.scribbler.restWebService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping
	@RequestMapping("api/v1/add")
	public double addition(double firstOperand, double secondOperand) {
		return firstOperand + secondOperand;
	}
	
	@PostMapping("api/v2/add")
	@ResponseBody
	public double addition(InputData inputs) {
		return inputs.getFirstOperand() + inputs.getSecondOperand();
	}
}
