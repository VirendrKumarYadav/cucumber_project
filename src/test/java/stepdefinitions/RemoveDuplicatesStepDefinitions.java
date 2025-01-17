package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveDuplicatesStepDefinitions {
	private String input;
	private String result;

	@Given("the input string is {string}")
	public void theInputStringIs(String inputString) {
		this.input = inputString;
	}

	@When("I remove repeated characters")
	public void iRemoveRepeatedCharacters() {
		result = removeDuplicates(input);
	}

	@Then("the result should be {string}")
	public void theResultShouldBe(String expectedResult) {
		assertEquals(expectedResult, result);
	}

	private String removeDuplicates(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
