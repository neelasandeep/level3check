package allpages.day1.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Generic;

public class AxesFindings {
	WebDriver driver;
	Generic generic;

	public AxesFindings(WebDriver driver) {

		this.driver = driver;
		generic = new Generic(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Email']/following-sibling::input[1]")
	WebElement email;
	@FindBy(xpath = "//div[@class='container']/child::label")
	List<WebElement> labelsusingchild;
	@FindBy(xpath="//td[contains(text(),'Maria')]/preceding-sibling::td/input[@type='checkbox']")
    WebElement precedingchild;
	@FindBy(xpath="//div[@class='container']/descendant::button")
	List<WebElement> descendantchild;
	
	public void checkfollowingsiblingbyemailExample() {

		generic.gotoxpath();
		email.sendKeys("abc@gamil.com");

	}
	public int labelscountusingchildMethod() {
		generic.gotoxpath();
		return labelsusingchild.size();
	}
	public void precedingsiblingcheckbox() {
		generic.gotoxpath();
		precedingchild.click();
	}
	public void descendantchildExample() {
		generic.gotoxpath();
		descendantchild.size();
	}

}
