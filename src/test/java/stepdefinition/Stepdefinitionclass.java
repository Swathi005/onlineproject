package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitionclass {
	WebDriver driver;

@Given("The user is on the application home page")
public void the_user_is_on_the_application_home_page() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\jar file\\chromedriver_win32\\chromedriver.exe"); 
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   Thread.sleep(9000);
	   driver.get("http://automationpractice.com/index.php");
    
}

@When("User click on the sign in option")
public void user_click_on_the_sign_in_option() throws Exception {
	Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='login']")).click();
}

@When("Enter the login details {string} and {string}")
public void enter_the_login_details_and(String username, String password) throws Exception {
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys(username);
    driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
    Thread.sleep(3000);
}

@Then("click the sign in button")
public void click_the_sign_in_button() throws Exception {
    driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
    Thread.sleep(3000);
    
}

@Then("the user should not alow to login")
public void the_user_should_not_alow_to_login() throws InterruptedException {
    System.out.println("Wrong Username and Password ");
    Thread.sleep(3000);
}

}
