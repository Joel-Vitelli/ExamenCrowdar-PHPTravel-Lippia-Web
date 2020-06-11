package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PHPTravelsHotelSearchPage extends PageBasePHPTravels {

    private final String BUTTON_DETAIL_HOTEL_CSS_SELECTOR = "#LIST > li:nth-child(%s) > div > div > div.col-12.col-auto > div > div.content-bottom.mt-auto > div > div.ml-auto > form";
    private final String BUTTON_BOOK_NOW_CSS_SELECTOR = "#detail-content-sticky-nav-02 > div.room-item-wrapper > div:nth-child(%s) > div > div.col-6.col-md-6.align-self-center > div > div.col-5.col-sm-4.col-md-4.ml-auto > form";
    private final String DD_TITLE = "#title";
    private final String DD_TITLE_ITEM = "#title > option:nth-child(%s)";
    private final String FIRST_NAME = "#first_name";
    private final String LAST_NAME = "#last_name";
    private final String EMAIL_ADDRESS = "//*[@id='email']";
    private final String DD_COUNTRY_CLICK = "#country_code_chosen";
    private final String DD_COUNTRY = "#country_code_chosen > div > div > input";
    private final String PHONE = "#phone_number";
    private final String BUTTON_COMPLETE_BOOKING = "#thhotels > div > div.col-md-8.mt-30 > div:nth-child(4) > form:nth-child(2)";

    public PHPTravelsHotelSearchPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void selectHotelList(int hotel){
        clickElement(By.cssSelector(String.format(BUTTON_DETAIL_HOTEL_CSS_SELECTOR,hotel)));
    }

    public void checkTitleHotel(){
        Assert.assertTrue(driver.getTitle().isEmpty());
    }

    public void selectRoomList(int room){
        clickElement(By.cssSelector(String.format(BUTTON_BOOK_NOW_CSS_SELECTOR,room)));
    }

    public void completePersonalFields(String title, int title_code , String f_name, String l_name, String email, String country, String phone){
        completeField(By.cssSelector(FIRST_NAME),f_name);
        completeField(By.cssSelector(LAST_NAME),l_name);
        completeField(By.cssSelector(PHONE),phone);
        clickElement(By.cssSelector(DD_TITLE));
        clickElement(By.cssSelector(String.format(DD_TITLE_ITEM,title_code)));
        clickElement(By.cssSelector(DD_COUNTRY_CLICK));
        WebElement searchCountry = driver.findElement(By.cssSelector(DD_COUNTRY));
        searchCountry.clear();
        searchCountry.sendKeys(country);
        searchCountry.sendKeys(Keys.TAB);
    }

    public void clickCompleteBookingButton(){
        clickElement(By.cssSelector(BUTTON_COMPLETE_BOOKING));
    }
}
