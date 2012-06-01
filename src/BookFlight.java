import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*;

public class BookFlight {
	private WebDriver driver;
	
	// Constructor
	public BookFlight(WebDriver driver) {
		this.driver = driver;
	}	
	
	//Method to automate Book Flight
	public void automateBookFlight() {
		driver.findElement(By.name("passFirst0")).clear();
		driver.findElement(By.name("passFirst0")).sendKeys("Anthony");
		driver.findElement(By.name("passLast0")).clear();
		driver.findElement(By.name("passLast0")).sendKeys("Newman");
		new Select(driver.findElement(By.name("pass.0.meal"))).selectByVisibleText("Diabetic");
		new Select(driver.findElement(By.name("creditCard"))).selectByVisibleText("MasterCard");
		driver.findElement(By.name("creditnumber")).clear();
		driver.findElement(By.name("creditnumber")).sendKeys("777777777777");
		new Select(driver.findElement(By.name("cc_exp_dt_mn"))).selectByVisibleText("03");
		new Select(driver.findElement(By.name("cc_exp_dt_yr"))).selectByVisibleText("2010");
		driver.findElement(By.name("cc_frst_name")).clear();
		driver.findElement(By.name("cc_frst_name")).sendKeys("Anthony");
		driver.findElement(By.name("cc_mid_name")).clear();
		driver.findElement(By.name("cc_mid_name")).sendKeys("R");
		driver.findElement(By.name("cc_last_name")).clear();
		driver.findElement(By.name("cc_last_name")).sendKeys("Newman");
		driver.findElement(By.name("billAddress1")).clear();
		driver.findElement(By.name("billAddress1")).sendKeys("1261 Highett Street");
		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys("Richmond");
		driver.findElement(By.name("billZip")).clear();
		driver.findElement(By.name("billZip")).sendKeys("77777");
		new Select(driver.findElement(By.name("billCountry"))).selectByVisibleText("AUSTRALIA");
		driver.findElement(By.name("buyFlights")).click();
	}
	
	//Method to test that we are on the right page
	public void test_automateBookFlight() {
		//assert that the current page URL is the same as the expected URL.
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		assertEquals("http://newtours.demoaut.com/mercurypurchase2.php", driver.getCurrentUrl());
	}

}
