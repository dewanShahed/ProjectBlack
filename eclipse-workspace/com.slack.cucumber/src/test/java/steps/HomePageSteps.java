package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {
	@Given("^I want enter \"([^\"]*)\" and \"([^\"]*)\" and click signin$")
	public void i_want_enter_and_and_click_signin(String arg1, String arg2) throws Throwable {
		initialization();
		getSignInPage();
		sip.enterSlackEmail(arg1);
		sip.enterSlackPass(arg2);
		
		
	}

	@When("^create a channel \"([^\"]*)\" under channels in homePage$")
	public void create_a_channel_under_channels_in_homePage(String arg1) throws Throwable {
		  getHomePage();	
		 hp.goToChannels();	
		 hp.allChannels(arg1);
		 hp.isPresent(arg1);
		
	}

	@Then("^I validate  the \"([^\"]*)\" channelName in channels under homepage$")
	public void i_validate_the_channelName_in_channels_under_homepage(String arg1) throws Throwable {
		 boolean existingChannel=hp.isPresent(arg1); 
		 Assert.assertFalse(existingChannel);
	}

	@When("^i want to delete the channel and verify the channel name$")
	public void i_want_to_delete_the_channel_and_verify_the_channel_name() throws Throwable {
		getPostMessagePage();
		 pmp.consignPost();
	}

	@When("^i want write \"([^\"]*)\"on homepage$")
	public void i_want_write_on_homepage(String arg1) throws Throwable {
		 pmp.writePost(arg1);
	}

	@Then("^i want to validate \"([^\"]*)\" under  homepage$")
	public void i_want_to_validate_under_homepage(String arg1) throws Throwable {
		 String poster=pmp.consignValidation();
		 Assert.assertEquals(poster, arg1);
	}



/*@Given("^I want enter \"([^\"]*)\" and \"([^\"]*)\" and click signin$")
public void i_want_enter_and_and_click_signin(String arg1, String arg2) throws Throwable {
	
	TestBase.initialization();
 }
	@When("^create a channel \"([^\"]*)\" under channels in homePage$")
	public void create_a_channel_under_channels_in_homePage(String arg1) throws Throwable {
	getHomePage();
	
	 hp.goToChannels();	
	 hp.allChannels(arg1);
	 hp.isPresent(arg1);
}
	@Then("^I validate  the \"([^\"]*)\" channelName in channels under homepage$")
	public void i_validate_the_channelName_in_channels_under_homepage(String arg1) throws Throwable {
	
	 boolean existingChannel=hp.isPresent(arg1); 
	 Assert.assertFalse(existingChannel);
	}
	@When("^i want to delete the channel and verify the channel name$")
	public void i_want_to_delete_the_channel_and_verify_the_channel_name() throws Throwable {
		getPostMessagePage();
		 pmp.consignPost();
	 
  }
	@When("^i want write \"([^\"]*)\"on homepage$")
	public void i_want_write_on_homepage(String arg1) throws Throwable {
		
		 pmp.writePost(arg1);
}
	@Then("^i want to validate \"([^\"]*)\" under  homepage$")
	public void i_want_to_validate_under_homepage(String arg1) throws Throwable {
		
		 String poster=pmp.consignValidation();
		 Assert.assertEquals(poster, arg1);

}}*/

}
