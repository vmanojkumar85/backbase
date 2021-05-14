package pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class NewPost extends PageObject {

	public static HashMap<String, String> pageMap;

	static
	{
	pageMap =new HashMap<String, String>();
	pageMap.put("Article Title", "input[placeholder='Article Title']");//css selector
	pageMap.put("Article About", "input[placeholder*='article about']");//css selector
	pageMap.put("Article Body", "textarea[placeholder*='Write your article']");//css selector
	pageMap.put("Article Tags", "input[placeholder='Enter Tags']");//css selector
	pageMap.put("Publish Article", "button.btn");//css selector
	}
	
	public void click(String key) {
		getDriver().findElement(By.cssSelector(pageMap.get(key))).click();
	}
	
	public void enterText(String key,String value) {
		getDriver().findElement(By.cssSelector(pageMap.get(key))).sendKeys(value);
	}
	
	
}
