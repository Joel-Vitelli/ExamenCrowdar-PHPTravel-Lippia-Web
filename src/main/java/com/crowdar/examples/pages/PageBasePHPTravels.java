package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBasePHPTravels extends PageBaseWeb {

    public PageBasePHPTravels(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "http://phptravels.net/";
    }


}
