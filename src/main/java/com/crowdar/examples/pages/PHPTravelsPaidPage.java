package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PHPTravelsPaidPage extends PageBasePHPTravels {

    private final String EMAIL_PAID_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > div:nth-child(1) > div > input";
    private final String BUTTON_CONTINUE_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > button";
    private final String DD_COUNTRY_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > div:nth-child(2)";
    private final String DD_COUNTRY_ITEM_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > form > div:nth-child(2) > div > select";
    private final String BUTTON_PAID_WHIT_CREDIT_CARD_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > div > button:nth-child(1)";
    private final String INPUT_NUMBER_CC_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-emmjRN.jcwRLk > input";
    private final String INPUT_NAME_CSS_SELECTOR= "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-emmjRN.MELcG > input";
    private final String INPUT_E_MONTH_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-eMigcr.buoHqB > div.sc-caSCKo.gSbXTv > div > div.sc-emmjRN.fcXOjx > input";
    private final String INPUT_E_YEAR_CSS_SELECTOR= "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-eMigcr.buoHqB > div.sc-caSCKo.gSbXTv > div > div.sc-emmjRN.bfAelg > input";
    private final String INPUT_CVV_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > div > div.sc-eMigcr.buoHqB > div.sc-itybZL.guWbgh > div > input";
    private final String BUTTON_PAID_NOW_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-daURTG.iTURvz > form > button";

    public PHPTravelsPaidPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }



    public void competeEmailPaiment(String info){
        completeField(By.cssSelector(EMAIL_PAID_CSS_SELECTOR),info);
    }

    public void clickTheContinueButton(){
        clickElement(By.cssSelector(BUTTON_CONTINUE_CSS_SELECTOR));
    }

    public void selecCountryPaidPage(String country_code){
        clickElement(By.cssSelector(DD_COUNTRY_CSS_SELECTOR));
        WebElement ddCountry = driver.findElement(By.cssSelector(DD_COUNTRY_ITEM_CSS_SELECTOR));
        ddCountry.sendKeys(country_code);
        ddCountry.sendKeys(Keys.ENTER);
        clickTheContinueButton();
    }

    public void clickOnPaidWhitCreditCardButton(){
        clickElement(By.cssSelector(BUTTON_PAID_WHIT_CREDIT_CARD_CSS_SELECTOR));
    }

    public void completeCreditCardInformation(String number, String name, String eMonth, String eYear, String cvv){
        completeField(By.cssSelector(INPUT_NUMBER_CC_CSS_SELECTOR),number);
        completeField(By.cssSelector(INPUT_NAME_CSS_SELECTOR),name);
        completeField(By.cssSelector(INPUT_E_MONTH_CSS_SELECTOR),eMonth);
        completeField(By.cssSelector(INPUT_E_YEAR_CSS_SELECTOR),eYear);
        completeField(By.cssSelector(INPUT_CVV_CSS_SELECTOR),cvv);

    }

    public void clickOnPaidNowButton(){
        clickElement(By.cssSelector(BUTTON_PAID_NOW_CSS_SELECTOR));
    }
}
