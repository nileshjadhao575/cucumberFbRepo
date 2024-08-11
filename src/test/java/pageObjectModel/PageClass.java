package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {
	public WebDriver driver;
	public PageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	@FindBy (id="email")
	WebElement userid;
	
	@FindBy (id="pass")
	WebElement pass;
	
	@FindBy(id="loginbutton")
	WebElement loginBt;
	
	
	public void username() {
		userid.sendKeys("nilesh@gmail.com");
	}
	
	public void password () {
		pass.sendKeys("12345678");
	}
	
	public void LoginBT() {
		loginBt.click();
	}

}
