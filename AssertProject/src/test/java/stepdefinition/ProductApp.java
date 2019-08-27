package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ProductApp {
	public String testPal;
    public boolean isPal;
	@Given("^I entered string \"([^\"]*)\"$")
	public void i_entered_string(String test) throws Throwable {
	    
		 testPal= test;
	}

	@When("^I test it for palindrome$")
	public void i_test_it_for_palindrome() throws Throwable {
		isPal= testPal.equalsIgnoreCase(new StringBuilder(testPal).reverse().toString());
	}

	@Then("^the result should be \"([^\"]*)\"$")
	public void the_result_should_be(String string) throws Throwable {
		  boolean estRes= Boolean.parseBoolean(string);
	        if(estRes) {
	            Assert.assertTrue(isPal);
	        }else {
	            Assert.assertFalse(isPal);
	        }
	    }
	}



