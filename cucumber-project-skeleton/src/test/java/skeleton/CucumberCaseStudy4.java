package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberCaseStudy4 {
	WebDriver d;  
	String expmsg;
	String actmsg;

	@Given("peeter provide correct login credentials and TestMeApp home page open")
	public void peeter_provide_correct_login_credentials_and_TestMeApp_home_page_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Renuka Sabe\\Desktop\\gft training\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    d.findElement(By.linkText("SignIn")).click();
	    d.findElement(By.id("userName")).sendKeys("Lalitha");
	    d.findElement(By.id("password")).sendKeys("Password123");
	    d.findElement(By.cssSelector("input[value='Login']")).click();
	    Thread.sleep(2000);
	}

	@When("peeter Search a particular product like headphones")
	public void peeter_Search_a_particular_product_like_headphones() throws Throwable {
		d.findElement(By.name("products")).sendKeys("Head");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
	    
	}

	@When("try to proceed to payment by adding item in cart")
	public void try_to_proceed_to_payment_by_adding_item_in_cart() throws Throwable {
		d.findElement(By.partialLinkText("Add to cart")).click();
		Thread.sleep(3000);
	    
	}

	@Then("TestMeApp display the cart icon")
	public void testmeapp_display_the_cart_icon() {
		expmsg="Cart";
		actmsg=d.findElement(By.cssSelector("div[class='shop-menu pull-right']")).getText();
		Assert.assertTrue(actmsg.contains(expmsg));
		System.out.println("Test is passed");
	}


}
