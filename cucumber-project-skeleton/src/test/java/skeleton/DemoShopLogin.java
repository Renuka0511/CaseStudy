package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoShopLogin {
	WebDriver d;
	
	@Given("online demoshop gets open")
	public void online_demoshop_get_open() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Renuka Sabe\\Desktop\\gft training\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
			d.get("http://demowebshop.tricentis.com/");
			Thread.sleep(1000);
	}

	@When("Renuka gives valid username and password")
	public void renuka_gives_valid_username_and_password() throws Throwable {
		  d.findElement(By.linkText("Log in")).click();
		  d.findElement(By.id("Email")).sendKeys("rsabe11@gmail.com");
	      d.findElement(By.id("Password")).sendKeys("Asdfgh");
	      d.findElement(By.cssSelector("input[value='Log in']")).click();
	      Thread.sleep(2000);
	}

	@Then("she is able to open the home page of demoshop")
	public void she_is_able_to_open_the_demoshop_hpome_page() {
		String LoginName=d.findElement(By.cssSelector("a.account")).getText();
		Assert.assertTrue(LoginName.contains("rsabe@gmail.com"));
		System.out.println("test is passed");
	    //d.findElement(By.linkText("Log out")).click(); 
	    
	}



}
