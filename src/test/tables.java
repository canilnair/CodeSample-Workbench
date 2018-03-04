package test;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {
	
	@Test
	public void table(){
		System.setProperty("webdriver.chrome.driver", "/Users/anair/Documents/Software/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlx.com/docs/products/dhtmlxGrid/");
		
		List<WebElement> table = driver.findElements(By.xpath("//*[@class='obj row20px']//*[contains(@class,'material')]"));
		for (int i=0; i<table.size();i++) {
			List<WebElement> rows = table.get(i).findElements(By.tagName("td"));
			for (int r=0; r<rows.size();r++){
				System.out.println(rows.get(i).getText());
			}
		}
	}

}
