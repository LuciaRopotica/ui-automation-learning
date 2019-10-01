package specs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.Header;
import pageobjects.Home;
import pageobjects.Login;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginTest {
	private static WebDriver driver;
	private static Header header;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		header = new Header(driver);
			
	}
	
	@Before
	public void initial() {
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		Home homePage = new Home(driver);
		homePage.pressSignIn();
		
		
	}
	
	 @Test
	 public void loginWithSuccess() {
		 Login loginPage = new Login(driver);
		 loginPage.loginWith("johnsnow@workshop.com", "iknoweverything");
		 header.checkUserLogged("John Snow");
		 
	 }
	 
	 @Ignore
	 @Test
	 public void loginWithSuccess2() {
		 Login loginPage = new Login(driver);
		 loginPage.loginWith("johnsnow@workshop.com", "iknoweverything");
		 //assertEquals(2, 3);
	 }
	 
	 @Ignore
	 @Test
	 public void loginWithSuccess3() {
		 Login loginPage = new Login(driver);
		 loginPage.loginWith("johnsnow@workshop.com", "iknoweverything");
		 //assertEquals(2, 3);
		 
	 }
	 
	 @After
	 public void signout() {
		Header header = new Header(driver);
		header.signOut();
		
	 }
	 
	 
	 @AfterClass
	 public static void tearDown() {
		 driver.close();
		 
	 }
	
}
