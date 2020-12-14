package stepDefinition.Hotels;

import Pages.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
    LandingPage lPage = new LandingPage();


    @When("^I enter '(.+)' in search$")
    public void hotelSearch(String word) {
        lPage.enterDestination(word);
    }

    @When("^I select '(.+)' from autosuggestion$")
    public void selectLakeGeorge(String location){
        lPage.selectLG(location);
    }

    @When("^I click Search button$")
    public void clickSearchButton(){
        lPage.clickSearchOnLakeG();
    }
    @Then("^I verify search header contains text selected  from  autosuggestion$")
    public boolean verifySearchHeader(){
         boolean ver= lPage.verifySearchHeaderName();
        return ver;
    }

    @Then("^I verify text under 'Destination, property, or landmark' is same  as text selected$")
    public boolean verifyDest(){
        boolean verDest = lPage.verifyDestination();
        return verDest;
    }

}
