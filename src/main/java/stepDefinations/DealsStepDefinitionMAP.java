package stepDefinations;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefinitionMAP {
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
	@Then("^user enter username$")
	public void user_enter_UserName(DataTable credential1)  {
      
		for(Map<String, String>uname :credential1.asMaps(String.class, String.class))
				{
			     driver.findElement(By.name("username")).sendKeys(uname.get("username"));
				}
		
	   
	}
	
	@Then("^user enter password$")
	public void user_enter_Password(DataTable credential2 ) 
	{
		
		
		for(Map<String, String>pname :credential2.asMaps(String.class, String.class))
		{
			driver.findElement(By.name("password")).sendKeys(pname.get("password"));
		}
	   
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
	
	@Then("^user move mouse to Deals link$")
	public void user_move_mouse_to_Deals_link()  {
		driver.switchTo().frame("mainpanel");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	
	   
	}

	@Then("^user click on New Deals link$")
	public void user_click_on_New_Deals_link() {
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();  
	}

	@Then("^user fills deals deatails$")
	public void user_fills_and_and(DataTable deals) throws InterruptedException  {
		 for(Map<String, String> map:deals.asMaps(String.class, String.class))
		 {
		 driver.findElement(By.id("title")).sendKeys(map.get("title"));
		 driver.findElement(By.name("client_lookup")).sendKeys(map.get("company"));
	     driver.findElement(By.id("amount")).sendKeys(map.get("amount"));
	     driver.findElement(By.id("probability")).sendKeys(map.get("profitbilty"));
	     driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); 
	     Thread.sleep(3000);
	     
	     Actions action = new Actions(driver);
	 	 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	 	 driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	 	
	     
		 }
	
	   
	}

	/*@Then("^click on save contactBtn$")
	public void click_on_save_contactBtn()  {
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();  
	}*/

	
	@Then("^close the browser$")
	public void close_the_browser() {
	    driver.quit();
		 System.out.println("Hai anyhow i closed the browser succesfully")
	}

}
