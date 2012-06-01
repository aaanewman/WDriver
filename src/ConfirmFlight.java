import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
    import static org.junit.Assert.*;

public class ConfirmFlight {
	private WebDriver driver;
	
	// Constructor
	public ConfirmFlight(WebDriver driver) {
		this.driver = driver;
	}	
	
	//Method to automate Confirm Flight
	public void automateConfirmFlight() {
		driver.findElement(By.xpath("//td[2]/a/img")).click();
	}
	
	//Method to test that we are on the right page
	public void test_automateConfirmFlight() {
		//assert that the current page URL is the same as the expected URL.
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		assertEquals("http://newtours.demoaut.com/mercurywelcome.php", driver.getCurrentUrl());
	}

}
