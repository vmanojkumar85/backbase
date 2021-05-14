package enduserSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.Article;
import pages.BlogHome;
import pages.NewPost;
import pages.SignIn;

public class UserSteps{


	@Steps
	BlogHome blogHomePage;
	SignIn signInPage;
	NewPost newPost;
	Article article;
	
	@Step
	public void launchBlogHomePage() {
		blogHomePage.launchPage();
	}
	
	@Step
	public void signInClick(String key) {
		blogHomePage.click(key);
	}
	
	@Step
	public void createNewAccount(String key) {
		signInPage.click(key);
	}
	
	@Step
	public void userSignIn(String key) {
		signInPage.click(key);
	}

	@Step
	public void newPost(String key) {
		blogHomePage.click(key);
	}

	@Step
	public void publishArticle(String key) {
		newPost.click(key);
	}
	
	@Step
	public String getArticleName() {
		return article.getHeader();
	}
	
	
	
}
