// Import the libraries that we need
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

//Declare the main class responsible for the end to end automation test suit for Mercury Travel website
public class Main {
	// Declare an instance of WebDriver
	private WebDriver driver;
	
	//Before each test
	@Before
	public void setUp() {
		//declare and start WebDriver firefox session
		driver = new FirefoxDriver();
	}

	//The test to invoke Travel Website
	@Test
	public void init_Test(){
		//Declare instance of the class InitTravelWebsite 
		InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		//Call the methods of his class to invoke the website
		initTravelWebsite.automateInitTravelWebsite();
		//Call the methods of his class to check the page that we have invoked the Travel website
		initTravelWebsite.test_automateInitTravelWebsite();
	}
	
	//The test to invoke Login Website
	@Test
	public void login_Test(){
		//Declare instance of the class InitTravelWebsite 
		InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		//Call the methods of his class to invoke the website
		initTravelWebsite.automateInitTravelWebsite();
		//Declare instance of the class LoginTravelWebsite 
		LoginTravelWebsite loginTravelWebsite = new LoginTravelWebsite(driver);
		//Call the methods of his class to login the website
		loginTravelWebsite.automateLoginTravelWebsite();
		//Call the methods of his class to check the page that we have login the Travel website
		loginTravelWebsite.test_automateLoginTravelWebsite();
	}

	//After each test do the following
	@After
	public void tearDown(){
		driver.quit();
	}
}
