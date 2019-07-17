package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Repository {
	//WebDriver driver;
	
	@FindBy(how = How.ID, using = "EmailAddress")WebElement Email;
	@FindBy(how = How.ID, using = "Password")WebElement PWD;
	@FindBy(how = How.ID, using = "btnsignin")WebElement login;
	
	//public Repository(WebDriver Cons){
		//this.driver = Cons;
		//driver = Cons;
	//}

	public void actions(){
		Email.sendKeys("arunkumar.dhanasekar+always@spanllc.com");
		PWD.sendKeys("Arun@123");
		login.click();
		
	}
	
}
