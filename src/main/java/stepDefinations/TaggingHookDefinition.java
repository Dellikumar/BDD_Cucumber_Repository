package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggingHookDefinition {
	@Before
	public void setUp()
	{
		System.out.println("OPEN THE BROWSER");
		System.out.println("ENTER THE URL");
	}
	@After
    public void tearDown()
    {
    	System.out.println("CLOSE THE BROWSER");
    }
	@Before("@First")
	public void trydeleteDeals()
	{
		System.out.println("Iam trying to delete all the contacts");
	}
	@After("@First")
	public void deletedDeals()
	{
		System.out.println("Iam succesfully delete all the contacts");
	}
	@Given("^user should be on email page$")
	public void user_should_be_on_email_page() throws Throwable {
		
		System.out.println("User is on email page");
	  
	}

	@When("^send email is visible$")
	public void send_email_is_visible() throws Throwable {
		System.out.println("send email is visible");
	}

	@Then("^enter the recepient adress$")
	public void enter_the_recepient_adress() throws Throwable {
	   
		System.out.println("user enters recepient adress");
	}
	
	@Then("^click on send button$")
	public void click_on_send_button() throws Throwable {
		System.out.println("user clicks on send button");
	   
	}
	
	@Given("^user should be on contact page$")
	public void user_should_be_on_contact_page() throws Throwable {
	   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}

	@When("^save contact  is visible$")
	public void save_contact_is_visible() throws Throwable {
		 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); 
	}

	@Then("^enter the contact name$")
	public void enter_the_contact_name() throws Throwable {
		 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}

	@Then("^click on save button$")
	public void click_on_save_button() throws Throwable {
		 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); 
	}


}
