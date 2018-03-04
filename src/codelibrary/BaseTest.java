package codelibrary;

import java.awt.dnd.DragGestureEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.dragNdropPage;

public abstract class BaseTest extends webdriver{
	public WebDriver driver;
	public dragNdropPage x;

	@Parameters("browsername")
	@BeforeClass
	public void before(String browsername){
		
		if(browsername.equalsIgnoreCase("firefox")){
			this.driver = firefox();
			
		} else if(browsername.equalsIgnoreCase("chrome")){
			this.driver=chrome();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		x = new dragNdropPage(driver);
		
	}
	
	public void openSite(String webAddress){
		driver.get(webAddress);
	}

	@AfterClass
	public void after(){
		driver.quit();
	}

}
