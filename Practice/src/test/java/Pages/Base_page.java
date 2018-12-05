package Pages;

import org.junit.After;
import org.junit.Before;

import UtilityLibrary.Library;

public class Base_page extends Library{
	
	@Before
	public void BeforeTest()
	
	{
		Start_FireFox_Browser(URL);
		System.out.println("Here is the current URL" + driver.getCurrentUrl());
	}
	
	@After
	public void AfterTest() 
	
	{
		CloseBrowser();
	}

}	