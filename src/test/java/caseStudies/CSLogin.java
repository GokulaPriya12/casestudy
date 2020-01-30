package caseStudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CSLogin
{
	WebDriver driver;
	@When("user launches chrome in browser")
	public void user_launches_chrome_in_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2A.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		 System.out.println("chrome opened");
	}

	@When("user navigates to application")
	public void user_navigates_to_application() 
	{
		driver.get("http://newtours.demoaut.com/");
	   System.out.println("Application shows home page");
	}

	@When("user enters username as <{string}>")
	public void user_enters_username_as(String un)
	{
		driver.findElement(By.name("userName")).sendKeys(un);
	    System.out.println(un);
	}

	@When("user enters password as <{string}>")
	public void user_enters_password_as(String pw)
	{
		driver.findElement(By.name("password")).sendKeys(pw);
	    System.out.println("password is entered");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button()
	{
		driver.findElement(By.name("login")).click();
        System.out.println("login successful");
	}

}
