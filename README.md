A simple REST web service for calculator using Spring Boot in BDD style.

Running on ```localhost:8090```

Step 1: Create a simple Maven Spring project using (https://start.spring.io/)

Step 2: Import the Maven project in Eclipse and add the following dependencies in ```pom.xml```

```
<dependency>
  <groupId>io.cucumber</groupId>
  <artifactId>cucumber-java</artifactId>
  <version>4.2.6</version>
  <scope>test</scope>
</dependency>
<dependency>
  <groupId>io.cucumber</groupId>
  <artifactId>cucumber-junit</artifactId>
  <version>4.2.6</version>
  <scope>test</scope>
</dependency>
<dependency>
  <groupId>io.cucumber</groupId>
  <artifactId>cucumber-spring</artifactId>
  <version>2.1.0</version>
</dependency>
```

Step 3: Create the `feature` and the `CucumberTest` file as mentioned. (https://github.com/srikoushik/REST-webService-using-spring-and-BDD/tree/master/src/test/java/com/scribbler/restWebService)

Step 4: Create the `RestController` and `DataClass` under the main directory.
```
@RestController
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
```

Step 5: RUN `mvn test`

# NOTE: 
Change the Spring PORT in `application.properties` file.
