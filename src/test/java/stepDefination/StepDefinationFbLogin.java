package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjectModel.PageClass;

public class StepDefinationFbLogin {

	public WebDriver driver;
	PageClass obj = new PageClass(driver);
	
	@Given("user landed on home page")
	public void user_landed_on_home_page() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
	}

	@When("user enters username")
	public void user_enters_username() {
		obj = new PageClass(driver);
		obj.username();
		
	}

	@When("user entrs password")
	public void user_entrs_password() {
		obj.password();
	}

	@When("user click login button")
	public void user_click_login_button() {
		obj.LoginBT();
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		Thread.setDefaultUncaughtExceptionHandler(null);
		driver.close();
	}

}
