package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class StepDefination 
{
	public WebDriver driver;
	 @Given("^Intialize the chrome driver$")
	    public void intialize_the_chrome_driver() throws Throwable 
	 	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil\\OneDrive\\Desktop\\Chrome Driver 105\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
	    }

	    @When("^user navigate to URL$")
	    public void user_navigate_to_url() throws Throwable 
	    {
	    	driver.get("https://login.salesforce.com/?locale=in");
	    }
	    
	    @And("^user enter username and password and clicks on login button$")
	    public void user_enter_username_and_password_and_clicks_on_login_button() throws Throwable 
	    {
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Nikhil");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
	        driver.findElement(By.xpath("//input[@id='Login']")).click();
	    }

	    @Then("^user should be able to login$")
	    public void user_should_be_able_to_login() throws Throwable 
	    {
	     System.out.println("Hello, You have just login");
	    }

	 


}
