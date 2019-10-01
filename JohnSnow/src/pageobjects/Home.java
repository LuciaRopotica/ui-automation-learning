package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	private WebDriver driver;
	
	private By signInLocator = By.className("login");

	public Home(WebDriver driver) {
		this.driver = driver;
	}
	
	public void pressSignIn() {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(signInLocator));
		driver.findElement(signInLocator).click();
		
		
	}
	
	
}

