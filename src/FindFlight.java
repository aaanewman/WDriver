import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;


public class FindFlight {
	private WebDriver driver;
	
	// Constructor
	public FindFlight(WebDriver driver) {
		this.driver = driver;
	}	
	
	//Method to automate Find Flight
	public void automateFindFlight() {
		new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("New York");
		new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("September");
		//new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("18");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Paris");
		new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("September");
		driver.findElement(By.name("findFlights")).click();
	}
	
	//Method to test that we are on the right page
	public void test_automateFindFlight() {
		//assert that the current page URL is the same as the expected URL.
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		assertEquals("http://newtours.demoaut.com/mercuryreservation2.php", driver.getCurrentUrl());
	}

}