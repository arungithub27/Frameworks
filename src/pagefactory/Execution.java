package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution {
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\E-Backup\\Automation\\Drivers\\ChromeDriver\\Updated\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://secure.payrollspan.net/User/Login");
	}

	@AfterTest
	public void closebrowser(){
		driver.close();
	}
	
	@Test
	public void main(){
		Repository call = PageFactory.initElements(driver, Repository.class);
		call.actions();
	}
}
