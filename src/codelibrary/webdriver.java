package codelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class webdriver {
	
	protected WebDriver driver;
	
	protected WebDriver chrome(){
		System.setProperty("webdriver.chrome.driver", "/Users/anair/Documents/Software/Selenium/chromedriver");
		this.driver = new ChromeDriver();
		return driver;
	}
	
	protected WebDriver firefox(){
		System.setProperty("webdriver.gecko.driver", "/Users/anair/Documents/Software/Selenium/geckodriver");		
		return driver = new FirefoxDriver();
	}

}
