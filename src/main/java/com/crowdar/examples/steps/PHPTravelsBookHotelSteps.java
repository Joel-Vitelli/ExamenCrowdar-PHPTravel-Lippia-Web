package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.sl.In;

public class PHPTravelsBookHotelSteps extends PageSteps {

    @When("The user click the destination imput")
    public void theUserClickTheDestinationImput() {
        Injector._page(PHPTravelsHomePage.class).clickSearchFieldHotel();
    }

    @And("The user search for (.*)")
    public void theUserSearchForSearch(String hotel) {
        Injector._page(PHPTravelsHomePage.class).searchHotel(hotel);
    }

    @And("The user select the date of checkin in (.*)")
    public void theUserSelectTheDateOfCheckinInCheckIn(String date) {
        Injector._page(PHPTravelsHomePage.class).dateOfCheckIn(date);
    }

    @And("The user select the date of check out in (.*)")
    public void theUserSelectTheDateOfCheckOutInCheckOut(String date) {
        Injector._page(PHPTravelsHomePage.class).dateOfCheckOut(date);
    }

    @And("The user select (.*) adults and (.*) childs")
    public void theUserSelectAdultsAdultsAndChildChilds(int adult, int child) {
        Injector._page(PHPTravelsHomePage.class).countAdults(adult);
        Injector._page(PHPTravelsHomePage.class).countChilds(child);
    }

    @And("The user click the search button")
    public void theUserClickTheSearchButton() {
        Injector._page(PHPTravelsHomePage.class).clickSearchButton();
    }

    @Then("The user navigate to the search page of hotels")
    public void theUserNavigateToTheSearchPageOfHotels() {
        Injector._page(PHPTravelsHomePage.class).verifyTitleHotelResults();
    }

    @When("The user select the (.*) hotel of the list clicking the \"Details\" button")
    public void theUserSelectTheHotelResultHotelOfTheListClickingTheButton(int hotel) {
        Injector._page(PHPTravelsHotelSearchPage.class).selectHotelList(hotel);
    }

    @Then("The user navigate to the detail of the selected hotel")
    public void theUserNavigateToTheDetailOfTheSelectedHotel() {
        Injector._page(PHPTravelsHotelSearchPage.class).checkTitleHotel();
    }

    @When("The user select the (.*) room of the hotel clicking the \"Book Now\" button")
    public void theUserSelectTheRoomResultRoomOfTheHotelClickingTheButton(int room) {
        Injector._page(PHPTravelsHotelSearchPage.class).selectRoomList(room);
    }

    @And("The user complete the fields whit title of: (.*) whit (.*) code, First Name: (.*), Last Name: (.*), Email: (.*), Country: (.*), Phone: (.*)")
    public void theUserCompleteTheFieldsWhitTitleOfTitleFirstNameNameLastNameLNameEmailEmailCountryCountryPhonePhone(String title, int title_code , String f_name, String l_name, String email, String country, String phone) {
        Injector._page(PHPTravelsHotelSearchPage.class).completePersonalFields(title, title_code, f_name, l_name, email, country, phone);
    }

    @And("The user click the \"Complete Booking\" button")
    public void theUserClickTheButton() {
        Injector._page(PHPTravelsHotelSearchPage.class).clickCompleteBookingButton();
    }

    @Then("The user navigate to the paiment page")
    public void theUserNavigateToThePaimentPage() {
        Injector._page(PHPTravelsBookHotelResultPage.class).confirmNavigatePaidPage();
    }

    @When("The user complete the field of email whit (.*)")
    public void theUserCompleteTheFieldOfEmailWhitEmail(String info) {
        Injector._page(PHPTravelsPaidPage.class).competeEmailPaiment(info);
    }

    @And("The user click the \"Continue button\"")
    public void theUserClickThe() {
        Injector._page(PHPTravelsPaidPage.class).clickTheContinueButton();
    }

    @And("The user select (.*) country whit (.*) country code")
    public void theUserSelectDdCountryCountry(String country, String country_code) {
        Injector._page(PHPTravelsPaidPage.class).selecCountryPaidPage(country_code);
    }

    @And("The user click on the \"Pay Whit Credit Card\" button")
    public void theUserClickOnTheButton() {
        Injector._page(PHPTravelsPaidPage.class).clickOnPaidWhitCreditCardButton();
    }

    @And("The user complete the fields Number of card: (.*), Name of holder: (.*) Expiration month: (.*), Expiration year: (.*), CVV: (.*)")
    public void theUserCompleteTheFieldsNumberOfCardCardNumberNameOfHolderHolderNameExpirationMonthEmonthExpirationYearEyearCVVCvv(String number, String name, String eMonth, String eYear, String cvv) {
        Injector._page(PHPTravelsPaidPage.class).completeCreditCardInformation(number,name,eMonth,eYear,cvv);
    }

    @And("The user click the \"Paid now\" button")
    public void theUserClickPaidTheButton() {
        Injector._page(PHPTravelsPaidPage.class).clickOnPaidNowButton();
    }

    @Then("The user recive a error messaje display")
    public void theUserReciveAMessajeDisplay() {
        Injector._page(PHPTravelsPaidPageResultPage.class).confirmErrorMessaje();
    }


}
