import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import static org.junit.Assert.*;

public class LoginTravelWebsite {
	
	private WebDriver driver;
	
	// Constructor
	public LoginTravelWebsite(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void automateLoginTravelWebsite() {
		//assert that the current page URL is the same as the expected URL.
		//assertEquals("http://newtours.demoaut.com/", driver.getCurrentUrl());
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	}
	
	public void test_automateLoginTravelWebsite() {
		//assert that the current page URL is the same as the expected URL.
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		assertEquals("http://newtours.demoaut.com/mercuryreservation.php", driver.getCurrentUrl());
	}

}
