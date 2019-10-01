package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils {
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {			
		}
	}

	public void sleepMe(int time, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		}
	
	public void sleepUntilVisible(By locator, int defaulttimeout, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, defaulttimeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}
}
