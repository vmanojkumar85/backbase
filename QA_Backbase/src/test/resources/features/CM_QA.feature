Feature: General Functionality-CRUD Articles 

@CM 
Scenario: Create an Article 
	Given Launch the application and login 
	When sign in as a new user
	And validate user creation
	Then create a new user Article "QA-Article14"
	And verify article by name "QA-Article14"