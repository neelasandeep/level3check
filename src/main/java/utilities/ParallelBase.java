package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class ParallelBase {
//	public WebDriver driver;

	public ConfigDataprovider config;
	BrowserFactory browser;

	@BeforeSuite
	public void Initializeconfig() {
		config = new ConfigDataprovider();
		browser = new BrowserFactory();

	}

	public static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();

	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

		driver.set((ChromeDriver) browser.startBrowser());
		System.out.println(driver.get());
	}

	public WebDriver getdriver() {
		return driver.get();
	}

	public void open(String url) {

		getdriver().get(url);
		getdriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		getdriver().manage().window().maximize();
		getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void quitbrowser() {
		driver.get().quit();
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
