package caseStudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS1 
{
	WebDriver driver;
	@When("user launches chrome and registration page")
	public void user_launches_chrome_and_registration_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2A.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
		 driver.findElement(By.linkText("REGISTER")).click();
		 System.out.println("Registration page opened");
	}

	@When("User enters firstname as {string} in firstname field")
	public void user_enters_firstname_as_in_firstname_field(String fn)
	{
		driver.findElement(By.name("firstName")).sendKeys(fn);
	   System.out.println("Firstname is entered");
	}

	@When("User enters lastname as {string} in lastname field")
	public void user_enters_lastname_as_in_lastname_field(String ln)
	{
		driver.findElement(By.name("lastName")).sendKeys(ln);
	    System.out.println("Lastname is entered");
	}

	@When("user enters phonenumber as {string} in phone field")
	public void user_enters_phonenumber_as_in_phone_field(String ph) 
	{
		driver.findElement(By.name("phone")).sendKeys(ph);
	    System.out.println("phone number is entered");
	}

	@When("user enters email as {string} in email field")
	public void user_enters_email_as_in_email_field(String emailid)
	{
		driver.findElement(By.id("userName")).sendKeys(emailid);
	    System.out.println("email is entered");
	}

	@When("user enters address as {string} in address field")
	public void user_enters_address_as_in_address_field(String add) 
	{
		driver.findElement(By.name("address1")).sendKeys(add);
	   System.out.println("Adderess is registered");
	}

	@When("user enters city as {string} in city field")
	public void user_enters_city_as_in_city_field(String cit) 
	{
		driver.findElement(By.name("city")).sendKeys(cit);
	   System.out.println("City is entered");
	}

	@When("user enters State as {string} in state field")
	public void user_enters_State_as_in_state_field(String stt) 
	{
		driver.findElement(By.name("state")).sendKeys(stt);
	    System.out.println("State is selected");
	}

	@When("user enters postal code as {string} in postlcode field")
	public void user_enters_postal_code_as_in_postlcode_field(String pc) 
	{
		driver.findElement(By.name("postalCode")).sendKeys(pc);
	    System.out.println("postal is entered");
	}

	@When("user enters country as {string} in country field")
	public void user_enters_country_as_in_country_field(String cout)
	{
		Select sel=new Select(driver.findElement(By.name("country")));
		sel.selectByValue("92");
	    System.out.println("country is selected");
	}

	@When("user enters username as {string} in username field")
	public void user_enters_username_as_in_username_field(String un)
	{
		driver.findElement(By.name("email")).sendKeys(un);
        System.out.println("username is entered");
	}

	@When("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String pw)
	{
		driver.findElement(By.name("password")).sendKeys(pw);
        System.out.println("password is entered");
	}

	@When("user enters confirmpassword as {string} in confirmpassword field")
	public void user_enters_confirmpassword_as_in_confirmpassword_field(String cpw)
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(cpw);
	    System.out.println("confirmpassword is entered");
	}

	@Then("clicks on submit button")
	public void clicks_on_submit_button()
	{
		driver.findElement(By.name("register")).click();
	    System.out.println("submitted");
	}

}
