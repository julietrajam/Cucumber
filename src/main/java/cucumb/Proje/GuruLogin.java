package cucumb.Proje;


import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuruLogin {
   static WebDriver driver;
	@Given("^The user is in guru home page$")
	public void enter() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\julie\\eclipse-workspace\\SeleniumExample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	}

	@When("^The user logns with valid credentials$")
	public void login() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement txtuser = driver.findElement(By.name("uid"));
		txtuser.sendKeys("mngr161843");
		WebElement txtpass = driver.findElement(By.name("passsword"));
		txtpass.sendKeys("jAmEzEq");
		WebElement txt = driver.findElement(By.name("btnLogin"));
		txt.click();
		
	}

	@Then("^The user should be in home page$")
	public void next() {
       System.out.println("Welcome");
}
}
