package pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class Article extends PageObject {

	public static HashMap<String, String> pageMap;

	static
	{
	pageMap =new HashMap<String, String>();
	pageMap.put("Article Name", "//h1");
	}
	
	public String getHeader() {
		return getDriver().findElement(By.xpath(pageMap.get("Article Name"))).getText();
	}
	
}
