package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberCaseStudy2 {
	WebDriver d;
	String expmsg;
	String actmsg;

	@Given("peeter open the login page")
	public void peeter_open_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Renuka Sabe\\Desktop\\gft training\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    d.findElement(By.linkText("SignIn")).click();
	    
	}

	@When("peeter Provides The Correct Credentials {string} {string}")
	public void peeter_Provides_The_Correct_Credentials(String uname, String pass) throws Throwable {
		d.findElement(By.id("userName")).sendKeys(uname);
	    d.findElement(By.id("password")).sendKeys(pass);
	    d.findElement(By.cssSelector("input[value='Login']")).click();
	    Thread.sleep(2000);
	    expmsg=uname;
	   
	}

	@Then("peeter login To TestMeApp Home Page")
	public void peeter_login_To_TestMeApp_Home_Page() {
		actmsg=d.findElement(By.cssSelector("ul.nav")).getText();
		Assert.assertTrue(actmsg.contains(expmsg));
		    System.out.println("Test is passed");
	    
	}


}
