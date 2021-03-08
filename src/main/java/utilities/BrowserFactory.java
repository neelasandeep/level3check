package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	ChromeDriver driver = null;

	public WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static void quitBrowser(ChromeDriver driver) {
		driver.quit();
	}

}
