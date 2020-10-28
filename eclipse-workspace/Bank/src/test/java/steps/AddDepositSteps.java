package steps;

import org.junit.Assert;

import app.Bank;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDepositSteps {
Bank bk;

@Given("^I have  (\\d+)balance$")
public void i_have_balance(int arg1) throws Throwable {
	System.out.println(arg1);
    // Write code here that turns the phrase above into concrete actions
   bk=new Bank(arg1); 
    
    
}

@When("^I deposit (\\d+) in my account$")
public void i_deposit_in_my_account(int arg1) throws Throwable {
	System.out.println( arg1);
    // Write code here that turns the phrase above into concrete actions
	bk.deposite(arg1);
    
}

@Then("^I verify the (\\d+) will be in my account\\.$")
public void i_verify_the_will_be_in_my_account(int arg1) throws Throwable {
	System.out.println(arg1);
    // Write code here that turns the phrase above into concrete actions
  int actual= bk.getBalance();
  System.out.println(actual);
  Assert.assertEquals(arg1, actual);
}


} 
