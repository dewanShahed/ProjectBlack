package steps;

import org.junit.Assert;

import app.Bank;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Withdrow {
Bank bk;
@Given("^I have (\\d+)balance$")
public void i_have_balance(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(arg1);
	 bk=new Bank(arg1); 
}

@When("^I withdrow (\\d+) in my account$")
public void i_withdrow_in_my_account(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(arg1);
	bk.withdrow(arg1);
    
}

@Then("^I verify the (\\d+) will be in my account$")
public void i_verify_the_will_be_in_my_account(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(arg1);
	int actual=bk.getBalance(); //return type
	Assert.assertEquals(arg1, actual);
   
}


}
