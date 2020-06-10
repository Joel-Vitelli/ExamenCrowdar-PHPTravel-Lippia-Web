package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.AssertJUnit;
import sun.jvm.hotspot.utilities.Assert;

public class PHPTravelsResultPage extends PageBasePHPTravels {

    private final String RESULT_LENGUAGE_XPATH = "//*[@id='dropdownLangauge']/text()";
    private final String RESULTS_DIV_ID = "result-stats";

    private WebElement stats() {
        return getWebElement(By.xpath(RESULT_LENGUAGE_XPATH));
    }

    public PHPTravelsResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getStats() {
        return stats().getText();
    }

    public void confirmLenguage(String code){
        AssertJUnit.assertEquals(getStats(), getStats());
    }

}
