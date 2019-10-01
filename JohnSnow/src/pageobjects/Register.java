package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	
	private WebDriver driver;
	private By selectBx = By.name("id_state");
	
	public void selectOption(String option) {
		driver.findElement(selectBx);
		Select sb = new Select(driver.findElement(selectBx));
		sb.selectByValue(option);
		
	}
}
