package StepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

   /* @Given("^User is on NetBanking page$")
    public void user_is_on_netbanking_page()  {
    	System.out.println("User is on NetBanking page");
        
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password()  
    {
    	System.out.println("User login into application with username and password");
        
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
    	System.out.println("Home page is populated");
        
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed()  {
    	System.out.println("Cards are displayed");
        
    }
*/
	
	
	@Given("^User is on NetBanking page$")
	public void user_is_on_NetBanking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}