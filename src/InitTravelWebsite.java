import org.openqa.selenium.*;
import static org.junit.Assert.*;

public class InitTravelWebsite {

	private WebDriver driver;
	
	// Constructor
	public InitTravelWebsite(WebDriver driver) {
		this.driver = driver;
	}
	
	public void automateInitTravelWebsite() {
		driver.get("http://newtours.demoaut.com/");

	}
	
	public void test_automateInitTravelWebsite() {
		//assert that the current page URL is the same as the expected URL.
		assertEquals("http://newtours.demoaut.com/", driver.getCurrentUrl());
	}
}
