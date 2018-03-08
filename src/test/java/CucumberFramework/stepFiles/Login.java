package CucumberFramework.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
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
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	
	}
	
//	@After
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(3000);
//		this.driver.manage().deleteAllCookies();
//		this.driver.quit();
//		this.driver = null;
//		
//	}
	
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		driver.get("https://pt.stackoverflow.com/");
		
	}

	@And("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log-in']")).click();
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
