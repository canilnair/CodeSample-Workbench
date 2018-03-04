package pages;

import java.beans.Visibility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragNdropPage {
	WebDriver driver;
	
	@FindBy(className="demo-frame")
	WebElement demoFrame;
	
	@FindBy(xpath=".//*[@id='draggable']")
	WebElement drag;
	
	@FindBy(xpath=".//*[@id='droppable']")
	WebElement drop;
	
	public dragNdropPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchToDemoframe(){
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(demoFrame));
		driver.switchTo().frame(demoFrame);
	}
	
	public void dragNdrop(){
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(drag));
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.visibilityOf(drop));
		
		action.dragAndDrop(drag, drop).perform();
	}
	
	public void switchToMain(){
		driver.switchTo().defaultContent();
	}
	
	

}
