package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/rufusabioritsegbemi/Documents/TestingEclipse/SeleniumProject/lib/GeckoDriver/geckodriver");
		System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/firefox-bin");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://lindaikejisblog.com/");
		
		driver.quit();

	}

}
