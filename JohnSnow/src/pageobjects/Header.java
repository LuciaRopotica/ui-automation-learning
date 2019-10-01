package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Utils;




public class Header {
	
	private WebDriver driver;
	private By signOutBtn = By.className("logout");
	private By signOut = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");
	private By userAcc = By.className("account");
	private By info = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span");
	private Utils util = new Utils();
	
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	

	public void signOut() {
	
		util.sleepUntilVisible(signOutBtn, 10, driver);
		driver.findElement(signOutBtn).click();
	}
	
	
	public void checkUserLogged(String username) {
		WebElement elem = driver.findElement(userAcc);
		Assert.assertTrue(elem.isDisplayed());
		Assert.assertEquals(username, elem.getText());
		
	}
	public void checkInfo() {
		Assert.assertEquals("Call us now: 0123-456-789", driver.findElement(info).getText());
		Assert.assertTrue(driver.findElement(info).findElement(By.tagName("i")).isDisplayed());
		
		
	}
					
}

