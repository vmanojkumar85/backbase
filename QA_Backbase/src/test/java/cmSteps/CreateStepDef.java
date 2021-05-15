package cmSteps;

import org.junit.Assert;

import enduserSteps.UserSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import pages.NewPost;
import pages.SignIn;

public class CreateStepDef extends PageObject{
	
	//@Managed(driver = "chrome", uniqueSession=true)
	
	@Steps
	UserSteps usersteps;
	SignIn signInPage;
	NewPost newPost;
	
	@Given("^Launch the application and login$")
	public void get_the_input_details() {
		usersteps.launchBlogHomePage();
	}

	@When("^sign in as a new user$")
	public void create_the_article() {
		usersteps.signInClick("Sign in");
		usersteps.createNewAccount("NeedAnAccount");
		signInPage.enterText("Username", "manoj027");
		signInPage.enterText("Email", "manoj027@mail.com");
		signInPage.enterText("Password", "qabypass");
		usersteps.userSignIn("Submit");
	}
	
	@Step
	@And("^validate user creation$")
	public void validateUserCreation() {
		Assert.assertEquals("User Profile creation successfull", "BBlog",getDriver().getTitle());
	}
	
	@Then("^create a new user Article \"([^\"]*)\"$")
	public void createNewUserArticle(String articleName) {
		usersteps.newPost("New Post");
		newPost.enterText("Article Title", articleName);
		newPost.enterText("Article About", "QA-Automation12");
		newPost.enterText("Article Body", "QA-Automation testing with serenity");
		newPost.enterText("Article Tags", "QATag12");
		usersteps.publishArticle("Publish Article");
	}
	
	@Step
	@And("verify article by name \"([^\"]*)\"$")
	public void articleVerification(String article) throws InterruptedException {
		String articleName=usersteps.getArticleName();
		System.out.println("Name of the article->"+articleName);
		Assert.assertEquals("Article Validation Successfull", article,articleName);
	}
	
	
	
}
