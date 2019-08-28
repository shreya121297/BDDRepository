package stepdefinition;

import static org.junit.Assert.assertThat;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListCalc {
	
	private List<Integer> numbers;
	private int sum;
	@Given("^a list of prices$")
	public void a_list_of_prices(List<Integer> numbers) throws Throwable {
	    this.numbers=numbers;
	}

	@When("^I summarize them$")
	public void i_summarize_them() throws Throwable {
	    for (Integer number : numbers) {
			sum +=number;
		}
	}

	@Then("^I should get (\\d+)$")
	public void i_should_get(int estVal) throws Throwable {
	    assertThat(sum, estVal);
	    System.out.println("Please pay:" +sum);
	}

	private void assertThat(int sum2, int estVal) {
		// TODO Auto-generated method stub
		
	}


}
