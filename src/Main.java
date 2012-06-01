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
	//@Test
	//public void init_Test(){
		
		//Invoke the Travel web site
		//Declare instance of the class InitTravelWebsite 
		//InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		//Call the methods of his class to invoke the website
		//initTravelWebsite.automateInitTravelWebsite();
		//Call the methods of his class to check the page that we have invoked the Travel website
		//initTravelWebsite.test_automateInitTravelWebsite();
	//}
	
	//The test to invoke and Login Travel Website
	//@Test
	//public void login_Test(){
		
		//Invoke the Travel web site
		//Declare instance of the class InitTravelWebsite 
		//InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		//Call the methods of his class to invoke the website
		//initTravelWebsite.automateInitTravelWebsite();
		//Call the methods of his class to check the page that we have invoked the Travel website
		//initTravelWebsite.test_automateInitTravelWebsite();
	
		//Login to the Travel website
		//Declare instance of the class LoginTravelWebsite 
		//LoginTravelWebsite loginTravelWebsite = new LoginTravelWebsite(driver);
		//Call the methods of his class to login the website
		//loginTravelWebsite.automateLoginTravelWebsite();
		//Call the methods of his class to check the page that we have login the Travel website
		//loginTravelWebsite.test_automateLoginTravelWebsite();
	//}

	//The test to invoke and Login Travel Website and then find a flight
	@Test
	public void findFlight_Test(){
		
		// Invoke the Travel web site
		//Declare instance of the class InitTravelWebsite 
		InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		//Call the methods of his class to invoke the website
		initTravelWebsite.automateInitTravelWebsite();
		//Call the methods of his class to check the page that we have invoked the Travel website
		initTravelWebsite.test_automateInitTravelWebsite();
	
		//Login to the Travel website
		//Declare instance of the class LoginTravelWebsite 
		LoginTravelWebsite loginTravelWebsite = new LoginTravelWebsite(driver);
		//Call the methods of his class to login the website
		loginTravelWebsite.automateLoginTravelWebsite();
		//Call the methods of his class to check the page that we have login the Travel website
		loginTravelWebsite.test_automateLoginTravelWebsite();
		
		//Find a flight
		//Declare instance of the class FindFlight
		FindFlight findFlight = new FindFlight(driver);
		//Call the methods of his class to check the page that we can find a flight
		findFlight.automateFindFlight();
		//Call the methods of his class to check the page that we have Find Flight
		findFlight.test_automateFindFlight();
	}
	
	@Test
	public void selectFlight_Test(){
		
		// Invoke the Travel web site
		//Declare instance of the class InitTravelWebsite 
		InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		//Call the methods of his class to invoke the website
		initTravelWebsite.automateInitTravelWebsite();
		//Call the methods of his class to check the page that we have invoked the Travel website
		initTravelWebsite.test_automateInitTravelWebsite();
	
		//Login to the Travel website
		//Declare instance of the class LoginTravelWebsite 
		LoginTravelWebsite loginTravelWebsite = new LoginTravelWebsite(driver);
		//Call the methods of his class to login the website
		loginTravelWebsite.automateLoginTravelWebsite();
		//Call the methods of his class to check the page that we have login the Travel website
		loginTravelWebsite.test_automateLoginTravelWebsite();
		
		//Find a flight
		//Declare instance of the class FindFlight
		FindFlight findFlight = new FindFlight(driver);
		//Call the methods of his class to check the page that we can find a flight
		findFlight.automateFindFlight();
		//Call the methods of his class to check the page that we have Find Flight
		findFlight.test_automateFindFlight();
		
		//Select a flight
		//Declare instance of the class SelectFlight
		SelectFlight selectFlight = new SelectFlight(driver);
		
		//Call the methods of his class to check the page that we can select a flight
		selectFlight.automateSelectFlight();
		//Call the methods of his class to check the page that we have Book A Flight
		selectFlight.test_automateSelectFlight();
	}
	
	@Test
	public void bookFlight_Test(){
		
		// Invoke the Travel web site
		//Declare instance of the class InitTravelWebsite 
		InitTravelWebsite initTravelWebsite = new InitTravelWebsite(driver);
		//Call the methods of his class to invoke the website
		initTravelWebsite.automateInitTravelWebsite();
		//Call the methods of his class to check the page that we have invoked the Travel website
		initTravelWebsite.test_automateInitTravelWebsite();
	
		//Login to the Travel website
		//Declare instance of the class LoginTravelWebsite 
		LoginTravelWebsite loginTravelWebsite = new LoginTravelWebsite(driver);
		//Call the methods of his class to login the website
		loginTravelWebsite.automateLoginTravelWebsite();
		//Call the methods of his class to check the page that we have login the Travel website
		loginTravelWebsite.test_automateLoginTravelWebsite();
		
		//Find a flight
		//Declare instance of the class FindFlight
		FindFlight findFlight = new FindFlight(driver);
		//Call the methods of his class to check the page that we can find a flight
		findFlight.automateFindFlight();
		//Call the methods of his class to check the page that we have Find Flight
		findFlight.test_automateFindFlight();
		
		//Select a flight
		//Declare instance of the class SelectFlight
		SelectFlight selectFlight = new SelectFlight(driver);
		
		//Call the methods of his class to check the page that we can select a flight
		selectFlight.automateSelectFlight();
		//Call the methods of his class to check the page that we have Book A Flight
		selectFlight.test_automateSelectFlight();
		
		//Book a flight
		//Declare instance of the class SelectFlight
		BookFlight bookFlight = new BookFlight(driver);
		
		//Call the methods of his class to check the page that we can select a flight
		bookFlight.automateBookFlight();
		//Call the methods of his class to check the page that we have Book A Flight
		bookFlight.test_automateBookFlight();
		
		//Confirm a flight
		ConfirmFlight confirmFlight = new ConfirmFlight(driver);
		//Call the methods of his class to check the page that we can select a flight
		confirmFlight.automateConfirmFlight();
		//Call the methods of his class to check the page that we have Book A Flight
		confirmFlight.test_automateConfirmFlight();

	}

	//After each test do the following
	@After
	public void tearDown(){
		//driver.quit();
	}
}
