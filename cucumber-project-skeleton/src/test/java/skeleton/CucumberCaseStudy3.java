package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberCaseStudy3 {
	WebDriver d;
	String expmsg;
	String actmsg;

	@Given("After Login peeter Is In HomePage Of TestMeApp")
	public void after_Login_peeter_Is_In_HomePage_Of_TestMeApp() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Renuka Sabe\\Desktop\\gft training\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    d.findElement(By.linkText("SignIn")).click();
	    d.findElement(By.id("userName")).sendKeys("Lalitha");
	    d.findElement(By.id("password")).sendKeys("Password123");
	    d.findElement(By.cssSelector("input[value='Login']")).click();
	    Thread.sleep(1000);
	}

	@When("peeter Search The Required Product on Search Bar")
	public void peeter_Search_The_Required_Product_on_Search_Bar() throws Throwable {
	    d.findElement(By.name("products")).sendKeys("Head");
		Thread.sleep(1000);
		d.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);
	    
	}

	@Then("peeter See The Required Product Page With Option Of Add To Cart")
	public void peeter_See_The_Required_Product_Page_With_Option_Of_Add_To_Cart() {
		expmsg="Head";
		actmsg=d.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
		Assert.assertTrue(actmsg.contains(expmsg));
		System.out.println("Test is passed");
	}


}
