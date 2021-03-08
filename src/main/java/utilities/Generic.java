package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"nav1\"]/li[3]")
	WebElement selenium;
	@FindBy(xpath="//*[@id=\"nav1\"]/li[3]/ul/li[3]/a")
	WebElement practise;
	

	public Generic(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectdropdown(String dropdown, String visibletext) {

		Select drpCountry = new Select(driver.findElement(By.id(dropdown)));
		drpCountry.selectByVisibleText(visibletext);
	}
	
	public void gotoxpath() {
		selenium.click();
		practise.click();
	}
}
