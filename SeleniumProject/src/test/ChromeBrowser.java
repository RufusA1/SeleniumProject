package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/rufusabioritsegbemi/Documents/TestingEclipse/SeleniumProject/lib/ChromeDriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lindaikejisblog.com/");

	}

}
