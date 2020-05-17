package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginsStepDefinition{

	 WebDriver driver;

	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page()
	 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\narun\\Downloads\\Downloads1\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://psna.ecoleaide.com/home.htm");
	 }
	 
	 
    // @SuppressWarnings("deprecation")
   	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM(){
	String title = driver.getTitle();
	System.out.println("@@@"+title+"@@@");
	Assert.assertEquals("PSNA College Of Engineering & Technology - Student/Parent Portal", title);
	}
	
     @Then("^user enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("username_temp")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }

	 
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	// driver.findElement(By.className("btn btn-md btn-success")).click();
	 WebElement loginBtn =driver.findElement(By.xpath("//*[@id=\"div-login\"]/div[2]/form/button"));
	 loginBtn.click();
	 //JavascriptExecutor js = (JavascriptExecutor)driver;
	 //js.executeScript("arguments[0].click();", loginBtn);
	 }

     @And("^user is on homepage$")
	 public void user_is_on_hopme_page(){
	 String title = driver.findElement(By.className("logo-text")).getText();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("PSNA College of Engineering and Technology", title);
	 }
//	 
//	 @Then("^user moves to new contact page$")
//	 public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		
//		}
//	 
//	 
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	 }
//	 
//
	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
//	
//	
//	
//
}