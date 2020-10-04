package StepDefenition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	WebDriver driver;
@Before
public void bt() {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
@After
public void at() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\'welcome\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		driver.close();
	}
	
}
	@Given("I am able to view\\/navigate to login page")
	public void i_am_able_to_view_navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}


	//Some other steps were also undefined:

	@When("I update the user name as {string}")
	public void i_update_the_user_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("txtUsername")).sendKeys(string);
	}
	@When("I update the pass word as {string}")
	public void i_update_the_pass_word_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.className("button")).click();
	}
	@Then("I should see the user name as {string}")
	public void i_should_see_the_user_name_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(3000);
		String expected=driver.findElement(By.id("welcome")).getText();
		String actual = string;
		
		Assert.assertEquals(expected, string);
	}

//	@Then("i should see the error message as {string}")
//	public void i_should_see_the_error_message_as(String string) {
//		
//	}
	
	//io.cucumber.junit.UndefinedStepException: The step "I should see the error message as "Invalid credentials"" is undefined. You can implement it using the snippet(s) below:

		@Then("I should see the error message as {string}")
		public void i_should_see_the_error_message_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			String actual =driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
			Assert.assertEquals(string, actual);
		}


		
}
