/*package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateMultipleContacts {
	
	WebDriver driver;
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page()  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
	  
	}

	@When("^title name is FREE CRM$")
	public void title_name_is_FREE_CRM()  {
		String loginTitle=	driver.getTitle();
		System.out.println(loginTitle);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", loginTitle);
		
	  
	}

	@Then("^user enter username \"([^\"]*)\"$")
	public void user_enter_UserName(String uname)  {
      
		driver.findElement(By.name("username")).sendKeys(uname);
	   
	}

	@Then("^user enter password \"([^\"]*)\"$")
	public void user_enter_Password(String pwd)  {
		driver.findElement(By.name("password")).sendKeys(pwd);
	   
	}

	@Then("^user click on Login Btn$")
	public void user_click_on_Login_Btn() throws InterruptedException {
	   WebElement ele= driver.findElement(By.xpath("//input[@type='submit']"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();", ele);
	    Thread.sleep(3000);
	    
	}

	@Then("^user navigate to HomePage$")
	public void user_navigate_to_HomePage()  {
	   String HomePageTitle=driver.getTitle();
	   System.out.println(HomePageTitle);
	   Assert.assertEquals("CRMPRO", HomePageTitle);
	   
	}

	@Then("^user verify Title of HomePage$")
	public void user_verify_Title_of_HomePage()  {
		 String HomePageTitle=driver.getTitle();
		   System.out.println(HomePageTitle);
		   Assert.assertEquals("CRMPRO", HomePageTitle);
	    
	}
	
	@Then("^user move mouse to contacts link$")
	public void user_move_mouse_to_contacts_link()  {
		driver.switchTo().frame("mainpanel");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	
	   
	}

	@Then("^user click on New Contact link$")
	public void user_click_on_New_Contact_link() {
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();  
	}

	@Then("^user fills \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_fills_and_and(String firstname, String lastname, String position)  {
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
	 driver.findElement(By.id("company_position")).sendKeys(position);
	
	   
	}

	@Then("^click on save contactBtn$")
	public void click_on_save_contactBtn()  {
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();  
	}

	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}

}
*/