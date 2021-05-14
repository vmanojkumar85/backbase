package pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class SignIn extends PageObject {
	
	public static HashMap<String, String> pageMap;

	static
	{
	pageMap =new HashMap<String, String>();
	pageMap.put("NeedAnAccount", "//a[text()='Need an account?']");
	pageMap.put("HaveAnAccount", "//a[text()='Have an account?']");
	pageMap.put("Username", "//input[@placeholder='Username']");
	pageMap.put("Email", "//input[@placeholder='Email']");
	pageMap.put("Password", "//input[@placeholder='Password']");
	pageMap.put("Submit", "//button[@type='submit']");
	}
	
	public void click(String key) {
		getDriver().findElement(By.xpath(pageMap.get(key))).click();
	}
	
	public void enterText(String key,String value) {
		getDriver().findElement(By.xpath(pageMap.get(key))).sendKeys(value);
	}
	
}
