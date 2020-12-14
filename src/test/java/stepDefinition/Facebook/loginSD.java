package stepDefinition.Facebook;

import Pages.LandingPage;
import cucumber.api.java.en.When;

public class loginSD {
    LandingPage lpage= new LandingPage();


    @When("^I am enter '(.+)' in username$")
    public void enterUsername(String email){

    }

}
