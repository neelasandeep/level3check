package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;

	public ConfigDataprovider config;
	public BrowserFactory browser;

	@BeforeSuite
	public void Initializeconfig() {
		config = new ConfigDataprovider();
		
	}
	
	

	public WebDriver getdriver() {
		return driver;
	}

	public void open(String url) {

		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void quitbrowser() {
		driver.quit();
	}

	@AfterClass
	public void waittime() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
