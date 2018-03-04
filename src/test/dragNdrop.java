package test;
import org.testng.annotations.Test;

import codelibrary.BaseTest;

public class dragNdrop extends BaseTest{
	
	@Test
	public void dragndrop() throws Exception{
		
		openSite("http://jqueryui.com/droppable/");		
		
		
		x.switchToDemoframe();
		x.dragNdrop();
		x.switchToMain();


	}
	
	@Test
	public void dragndrop2() throws Exception
	{		
		openSite("http://jqueryui.com/droppable/");		
		
		
		x.switchToDemoframe();
		x.dragNdrop();
		x.switchToMain();


	}

}
