package stepDefinition;

import cucumber.api.java.en.Given;

public class LoginT {
	@Given("^I want to open application$")
	public void i_want_to_open_application() throws Throwable {
		System.out.println("Application is launched");
	    
	}

	@Given("^login with usename \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_usename_and_password(String arg1, String arg2) throws Throwable {
	    if(arg1.equals("admin") && arg2.equals("abc123"))
	    	System.out.println("login successful");
	    else
	    	System.err.println("try again...");
	}



}
