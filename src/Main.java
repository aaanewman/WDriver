
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@Test
	public void init_Test(){
		InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		initTravelWebsite.automateInitTravelWebsite();
		initTravelWebsite.test_automateInitTravelWebsite();
	}
	
	

	@After
	public void tearDown(){
		driver.quit();
	}

}
