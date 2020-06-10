package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelsHomePage extends PageBasePHPTravels {

    private final String DROPDOWN_LENGUAGE_ID = "dropdownLangauge";
    private final String ITEM_DD_ESPAÑOL_CSS_SELECTOR = "a#es";
    private final String ITEM_DD_LANGUAGE_CSS_SELECTOR = "a#(%s)";

    public PHPTravelsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void clikDropdownListLenguage(){
        clickElement(By.id(DROPDOWN_LENGUAGE_ID));
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ITEM_DD_ESPAÑOL_CSS_SELECTOR)));
    }

    public void selectLenguage(String code){
        clickElement(By.cssSelector(String.format(ITEM_DD_LANGUAGE_CSS_SELECTOR, code)));

    }


    /*public void enterSearchCriteria(String text) {
        completeField(By.xpath(INPUT_SEARCH_XPATH), text);
    }

    public void clickSearchButton() {
        clickElement(By.name(SEARCH_BUTTON_NAME));
    }

     */

}
