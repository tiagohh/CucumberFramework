package CucumberFramework.stepFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Before
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\teoa\\Desktop\\workspace\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
	
	}
	
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		System.out.println("Test");
	}

	@And("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		System.out.println("Test1");
	}

	@And("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		System.out.println("Test2");

	}

	@And("^Users enters a valide password$")
	public void users_enters_a_valide_password() throws Throwable {
		System.out.println("Test3");

	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		System.out.println("Test4");
	}

	@Then("^User should be taken to the sucessfull login page$")
	public void user_should_be_taken_to_the_sucessfull_login_page() throws Throwable {
		System.out.println("Test5");

	}

}
