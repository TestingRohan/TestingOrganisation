package main.java.com.StepDefinition;

import cucumber.api.java.en.Given;
import main.java.com.gen.genn;

public class stepdef extends genn {
	
	@Given("^I want to play$")
	public void i_want_to_play() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		play();
	}

}
