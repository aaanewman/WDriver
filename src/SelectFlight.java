import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import static org.junit.Assert.*;

public class SelectFlight {
	private WebDriver driver;
	
	// Constructor
	public SelectFlight(WebDriver driver) {
		this.driver = driver;
	}	
	
	//Method to automate Select Flight
	public void automateSelectFlight() {
		driver.findElement(By.xpath("(//input[@name='outFlight'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
		driver.findElement(By.name("reserveFlights")).click();
	}
	
	//Method to test that we are on the right page
	public void test_automateSelectFlight() {
		//assert that the current page URL is the same as the expected URL.
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		assertEquals("http://newtours.demoaut.com/mercurypurchase.php", driver.getCurrentUrl());
	}
}
