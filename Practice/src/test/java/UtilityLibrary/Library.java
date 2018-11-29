package UtilityLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {

	public WebDriver driver;
	public String URL = "https://www.amazon.com/";

	public WebDriver Start_FireFox_Browser(String URL) {
		try {
			System.setProperty("webdriver.gecko.driver", "All_Browsers/FireFox_geckoDriver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.navigate().to(URL);
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			e.getStackTrace();
		}
		return driver;
	}

	public WebDriver CloseBrowser()	{
		try {
			driver.close();
			driver.quit();

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			e.getStackTrace();
		}
		return driver;
	}

	public void putBrowserToSleepfor(int second) throws Exception	{
		Thread.sleep(second*1000);
	}

}
