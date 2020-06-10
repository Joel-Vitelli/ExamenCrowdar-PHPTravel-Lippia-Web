package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PHPTravelsHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangeLenguagePHPTravelsSteps extends PageSteps {

    @Given("The user is in PHP Travel page")
    public void home() {
        Injector._page(PHPTravelsHomePage.class).go();
    }

    @When("The user click the dropdown list of lenguages")
    public void theUserClikOnTheDropdownListOfLenguage(){
        Injector._page(PHPTravelsHomePage.class).clikDropdownListLenguage();
    }
    @And("The user select a (*.) of the list whit (*.)")
    public void theUserClikALenguageOfTheListWhitCode(String lenguage, String code) {
    }

    @Then("The user verify that the web is displayed in selected (*.)")
    public void theUserVerifyThatTheWebIsDisplayedInLenguage(String lenguage) {
    }

}
