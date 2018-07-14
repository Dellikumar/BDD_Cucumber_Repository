/*package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page()  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
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
	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
	}

}
*/