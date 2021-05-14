package pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class BlogHome extends PageObject {

	
	public static HashMap<String, String> pageMap;

	static
	{
	pageMap =new HashMap<String, String>();
	pageMap.put("Sign in", "//a[@routerlink='/login']");
	pageMap.put("New Post", "//a[contains(.,'New Post')]");
	}
	
	public void launchPage() {
		getDriver().get(" https://candidatex:qa-is-cool@qa-task.backbasecloud.com/");
	}
	public void click(String key) {
		getDriver().findElement(By.xpath(pageMap.get(key))).click();
	}

	
}
