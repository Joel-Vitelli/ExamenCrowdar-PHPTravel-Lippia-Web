package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class PHPTravelsChangeLenguageResultPage extends PageBasePHPTravels {

    private final String RESULT_LENGUAGE_URL = "https://phptravels.net/";
    private final String RESULTS_DIV_ID = "result-stats";



    public PHPTravelsChangeLenguageResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    public void confirmLenguage(String code){
        Assert.assertEquals(RESULT_LENGUAGE_URL+code,driver.getCurrentUrl());

    }

}
