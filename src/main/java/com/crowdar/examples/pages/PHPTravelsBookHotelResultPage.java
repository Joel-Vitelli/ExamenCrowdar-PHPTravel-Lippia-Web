package com.crowdar.examples.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PHPTravelsBookHotelResultPage extends PageBasePHPTravels {

    private final String RESULT_LENGUAGE_URL = "https://phptravels.net/";
    private final String RESULTS_DIV_ID = "result-stats";



    public PHPTravelsBookHotelResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void confirmNavigatePaidPage(){
        Assert.assertEquals("Paddle Checkout", driver.getTitle());
    }

}
