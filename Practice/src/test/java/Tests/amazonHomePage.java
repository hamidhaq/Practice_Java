package Tests;

import org.junit.Test;

import Pages.Base_page;
import UtilityLibrary.Library;

public class amazonHomePage extends Base_page{
	public static Base_page bp = new Base_page();
	
	@Test
	public void OpenBrowser() throws Exception
		{
			Thread.sleep(1000*5);
			System.out.println("Hey there");
		}
}
