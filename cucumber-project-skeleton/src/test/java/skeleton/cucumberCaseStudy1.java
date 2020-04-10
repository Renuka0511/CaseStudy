package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberCaseStudy1 {
	WebDriver d;
	String expmsg;
	String actmsg;
	
	@Given("peeter is On The Registration Page")
	public void peeter_is_On_The_Registration_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Renuka Sabe\\Desktop\\gft training\\chromedriver_win32\\chromedriver.exe");
        d=new ChromeDriver();
        d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
        d.findElement(By.linkText("SignUp")).click();
        Thread.sleep(2000);
	}

	@When("peeter gives The Correct Credentials {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void peeter_gives_The_Correct_Credentials(String uname, String fname, String lname, String pwd, String cpwd, String email, String phno, String add, String ans) throws Throwable {
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("firstName")).sendKeys(fname);
		d.findElement(By.name("lastName")).sendKeys(lname);
		d.findElement(By.name("password")).sendKeys(pwd);
		d.findElement(By.name("confirmPassword")).sendKeys(cpwd);
		d.findElement(By.cssSelector("input[value='Male']")).click();
		d.findElement(By.name("emailAddress")).sendKeys(email);
		d.findElement(By.name("mobileNumber")).sendKeys(phno);
		d.findElement(By.name("dob")).sendKeys("05/11/1997");
		d.findElement(By.name("address")).sendKeys(add);
		Select dropdown = new Select(d.findElement(By.id("securityQuestion")));  
		dropdown.selectByVisibleText("What is your Pet Name?");
		d.findElement(By.name("answer")).sendKeys(ans);
		d.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
	    
	}

	@Then("peeter Rendered To TestMeApp Login Page")
	public void peeter_Rendered_To_TestMeApp_Login_Page() throws Throwable {
		expmsg="Login";
		actmsg=d.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		    Assert.assertEquals(actmsg, expmsg);
		    System.out.println("CaseStudy 1 is passed");
		    Thread.sleep(2000);
	    
	}



}
